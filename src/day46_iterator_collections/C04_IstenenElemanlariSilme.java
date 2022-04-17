package day46_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_IstenenElemanlariSilme {
    public static void main(String[] args) {
        /**
         * Soru 3)
         * Bir listedeki istenen sayi araliginda olmayan elementleri silen
         * bir program yaziniz …
         * (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
         * Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
         * output: [23,40]
         */

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(13);
        list.add(56);
        list.add(23);
        list.add(45);
        list.add(14);
        list.add(40);

        ListIterator itr = list.listIterator();

        while (itr.hasNext()){

            //if (itr.next()>20 && itr.next()<40){} // bu sekilde kullanamayiz. cunku her next() de bir index ileri gider. dolayisiyla sarti okurken iki ileri gider. onun icin bir atama yapalim.

            Object sayi = itr.next(); // int sayi= olmaz. cunku iterator ler object mis.
            if ((Integer)sayi<20 || (Integer)sayi>40){  // sayi Object oldugundan (Integer) a cevirdik
                itr.remove();
            }
        }
        System.out.println(list);


    }
}
