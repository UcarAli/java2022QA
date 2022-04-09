package day40_overriding_polymorphism;

import java.util.Scanner;

public class C05_Exceptions {
    public static void main(String[] args) {

        //Kullanicidan istedigi kadar sayi alip toplayan bir program yaziniz
        // toplam 500 gecerse veya kullanici bitirmek istese programi bitirsin
        // Kullanici bitirmek istediginde Q girsin

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        do {
            System.out.println("Lutfen toplamak istediginiz sayiyi giriniz \n bitirmek icin Q'ya basiniz");
            int sayi= 0;

            try {
                sayi = scan.nextInt();
            } catch (Exception e) {


            }

            toplam+=sayi;


        } while (toplam<500);



    }
}
