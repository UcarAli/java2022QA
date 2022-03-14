package day07_ifElseStatements;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        // Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin
        // ve o harfle baslayan gun isimlerini yazdirin
        // Ornek: ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
        // ilkHarf=S output = “Sali”
        // *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin

        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanicidan gun isimlerinden birinin ilk harfini isteyin");
        String ilkHarf = scan.next().toUpperCase();

        if (ilkHarf.equals("P")) {
            System.out.println("P harfiyle baslayan gun isimleri : Pazar, Pazartesi, Persembe");
        } else if (ilkHarf.equals("S")) {
            System.out.println("S harfiyle baslayan gun isimleri : Sali");
        } else if (ilkHarf.equals("C")) {
            System.out.println("P harfiyle baslayan gun isimleri : Carsamba, Cuma, Cumartesi");
        } else System.out.println("lutfen gecerli bir gun ismi girin");


        // Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
        // olmadigini yazdirin

        System.out.println("Dikdorgen a kenarini girin :");
        int kenarA = scan.nextInt();
        System.out.println("Dikdorgen b kenarini girin :");
        int kenarB = scan.nextInt();

        if (kenarA==kenarB) {
            System.out.println("Bu bir kare");
        } else {
            System.out.println("Malesef bu bir kare degil");
        }


        // Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
        // gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
        // ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        System.out.println("bir gun ismi girin");
        String kutsalGun = scan.next().toLowerCase();

        if (kutsalGun.equals("pazartesi") || kutsalGun.equals("sali") || kutsalGun.equals("carsamba")
                || kutsalGun.equals("persembe") || kutsalGun.equals("cuma")
                || kutsalGun.equals("cumartesi") || kutsalGun.equals("pazar")) {
            if (kutsalGun.equals("cuma")) {
                System.out.println("Cuma Muslumanlar icin kutsal gun");
            } else if (kutsalGun.equals("cumartesi")) {
                System.out.println("Cumartesi Yahudiler icin kutsal gun");
            } else if (kutsalGun.equals("pazar")) {
                System.out.println("Pazar Hiristiyanlar icin kutsal gun");
            } else {
                System.out.println(kutsalGun + " Kutsal gun degil");
            }
        } else System.out.println("Lutfen gecerli bir gun giriniz");







        }
}
