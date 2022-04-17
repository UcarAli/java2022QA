package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeninElementleriniArtirma {
    public static void main(String[] args) {

        // Verilen listedeki her elementi 3 artiralim

        List<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste); // [5, 7, 8, 6, 9]

        /*
            listenin tum elementlerini bize getirmesi icin iterator'un
            hasNext() ve next() methodlarini kullanacagiz
         */

  /*
  Ders arasinda yaptigim bir deneme deneme
  dersde bunun Iterator la yapilamiyacagini
  ListIterator ile yapilabilecegini ogrendim :)

  Iterator itr = liste.iterator();

        while (itr.hasNext()){ // yaninda element oldugu muddetce calisacak

            System.out.print(itr.next()+" "); // 5 7 8 6 9
            // liste.set(itr.next()+3); bunu ben yaptim ama itr bu kullanilmiyormus
            // itr.set() kullanilmasi lazim ama Iterator de set method yok

        }
   */

        ListIterator itr = liste.listIterator();

        while (itr.hasNext()) { // yaninda element oldugu muddetce calisacak
            itr.set((Integer) itr.next() + 3); // itr.next() object oldugundan int cevirdik

        }
        System.out.println(liste);
    }
}











