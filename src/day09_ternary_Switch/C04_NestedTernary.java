package day09_ternary_Switch;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        // Verilen sayinin pozitif mi negatif mi oldugunu kontrol edip
        // 0 veya pozitif ise tek veya cift
        // negatif sayi ise -100'den buyuk veya kucuk oldugunu belirten bir ternary yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi girin.");

        int sayi = scan.nextInt();

        if (sayi>=0) {
            if (sayi%2==0) {
                System.out.println("Sayi pozitif cift sayi.");
            } else {
                System.out.println("Sayi pozitif tek sayi.");
            }
        } else {
            if (sayi<= -100) {
                System.out.println("Sayi -100 den kucuk negatif sayi.");
            } else {
                System.out.println("Sayi -100 den buyuk negatif sayi.");
            }
        }


        // turnary ile

        String sonuc = sayi>=0 ? (sayi%2==0 ? "Sayi pozitif cift sayi." : "Sayi pozitif tek sayi.") : (sayi<=-100 ? "Sayi -100 den kucuk negatif sayi." : "Sayi -100 den buyuk negatif sayi.");
        System.out.println(sonuc);





    }

}
