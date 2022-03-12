package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut
        // veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda
        // kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random rnd=new Random();
        int sayi=rnd.nextInt(100);
//        System.out.println(sayi);
        Scanner scan = new Scanner(System.in);
        System.out.println("     *** Sayi Tahmin Etmece Oyunu ***\nBilgisayar 1 ile 100 arasinda bir sayi tuttu. Haydi bu sayiyi tahmin edelim. :)) ");

        int tahmin = 0;
        int sayac = 0;

        while (sayi!=tahmin) {
            System.out.println("Tahmin ettiginiz sayiyi girin.");
            tahmin = scan.nextInt();
            if (tahmin<sayi) {
                System.out.println("Tahmin ettiginiz sayi, sayimizdan kucuk. Sayiyi buyultun.");
            } else if (tahmin>sayi) {
                System.out.println("Tahmin ettiginiz sayi, sayimizdan buyuk. Sayiyi kucultum.");
            }
            sayac++;
        }
        System.out.println("Tebrikler sayiyi "+sayac+" tahminde buldunuz. Sayimiz :"+tahmin+".");

    }
}
