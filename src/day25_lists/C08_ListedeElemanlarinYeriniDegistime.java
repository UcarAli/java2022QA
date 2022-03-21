package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarinYeriniDegistime {
    public static void main(String[] args) {

        // Verilen bir listede, istenen iki index deki elementlerin yerini
        // kalici olarak degistiren bir method olusturun

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        // System.out.println("sayilar = " + sayilar); // sayilar = [1, 3, 5, 3, 5, 6, 1, 7]

        int ilkIndex = 2;
        int ikinciIndex=5;

        sayilar = swapElements(sayilar,ilkIndex,ikinciIndex);
        System.out.println("sayilar = " + sayilar);

    }

    public static List<Integer> swapElements(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {

        // bir tam sayi olusturup verilen indexlerdeki sayilari yer degistirin
        // indexleri kontrol edip sinirin otesinde index verildiyse uyari mesaji yazdirin

        int swap=0;
        swap=sayilar[ikinciIndex];

        return sayilar;
    }
}
