package practice_BasicJavaPractice.practice_basic_day02;

import java.util.Scanner;

public class Q06_NestedIfandTernary {
    /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi girin :");
        int sayi = scan.nextInt();

        if (sayi>=0 && sayi<10) {
            if (sayi==0) System.out.println("sifir");
            else  if (sayi==1) System.out.println("bir");
            else  if (sayi==2) System.out.println("iki");
            else  if (sayi==3) System.out.println("uc");
            else  if (sayi==4) System.out.println("dort");
            else  if (sayi==5) System.out.println("bes");

        } else {
            System.out.println("Gecersiz");
        }


        // ternary
        String sonuc = sayi==1?"bir":sayi==0?"sifir":sayi==2?"iki":sayi==3?"uc":"verdiginiz deger gecersiz";

        System.out.println("sonuc = " + sonuc);

    }
}
