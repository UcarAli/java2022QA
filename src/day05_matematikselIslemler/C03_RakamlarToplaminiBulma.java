package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        // kullacidan aldiginiz 4 basamakli bir sayinin rakamlar toplamini bulunuz.

        Scanner scan =new Scanner(System.in);
        System.out.println("4 basamakli bir tamsayi giriniz");
        int sayi=scan.nextInt();

        int rakam=0;
        int rakamlarinToplami=0;

        // 1.adim
        rakam=sayi%10;
        rakamlarinToplami += rakam;
        sayi/=10;

        // 2.adim
        rakam=sayi%10;
        rakamlarinToplami += rakam;
        sayi/=10;

        // 3.adim
        rakam=sayi%10;
        rakamlarinToplami += rakam;
        sayi/=10;

        // 4.adim

        rakam=sayi%10;
        rakamlarinToplami += rakam;
        sayi/=10;


        System.out.println(rakamlarinToplami);





    }

}
