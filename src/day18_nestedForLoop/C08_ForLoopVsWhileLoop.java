package day18_nestedForLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhileLoop {
    public static void main(String[] args) {
        // kullanicidan toplamak istedigi sayilari alin
        // kullanicidan 0'a basincaya kadar sayi almaya devam edin
        // kullanici 0 a basinca girdigi tum sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
/*

        for (int i = 1; i <1000000 ; i++) {
            System.out.println("toplamak istediginiz sayiyilari girin. yeni sayi yoksa 0 (sifir) girin");
            sayi = scan.nextInt();

            if (sayi==0) {
                break;
            } else {
                toplam+=sayi;
            }

        }
        System.out.println("girilen sayilarin toplami : "+toplam);

*/

        // while loop ile yapilisi
        sayi=1;
        toplam=0;

        while (sayi!=0) {
            System.out.println("toplamak istediginiz sayiyilari girin. yeni sayi yoksa 0 (sifir) girin");
            sayi = scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("girilen sayilarin toplami : "+toplam);

        // baslangic,bitis ve degisim degerleri net olan durumlarda for loop daha avantajlidir
        // ama adim sayisi belli olmayan durumlarda while loop daha avantajlidir


    }
}
