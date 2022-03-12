package day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan kac sayi toplamak istedigini alin
        // sonra toplamak istedigi sayilari alin ve bunlarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac farkli sayi toplamak istediginizi girin");
        int sayiAdedi = scan.nextInt();

        int sayi = 0;
        int toplam = 0;
//
//        for (int i = 1; i <=sayiAdedi ; i++) {
//            System.out.println("siradaki toplamak istediginiz sayiyi girin");
//            sayi = scan.nextInt();
//            toplam+=sayi;
//        }
//        System.out.println("girilen "+sayiAdedi+" sayinin toplami : "+toplam);
//

        // while loop ile yapilisi
        sayi=0;
        toplam=0;
        int sayac = 1;

        while (sayac<=sayiAdedi) {
            System.out.println("siradaki toplamak istediginiz sayiyi girin");
            sayi = scan.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println("girilen "+sayiAdedi+" sayinin toplami : "+toplam);


    }
}
