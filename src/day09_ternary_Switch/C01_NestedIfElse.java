package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {

        // Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        // Girdiği sayi 5’e bölünüyorsa son rakamını kontrol edin.
        // Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
        // Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        // Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli pozitif bir tam sayi giriniz.");
        int sayi = scan.nextInt();

        if (sayi<1000 || sayi>9999) {
            System.out.println("Hatali sayi girisi yaptiniz. \nLutfen 4 basamakli pozitif bir tam sayi giriniz.");
        } else if (sayi%5==0) {
            if (sayi%10==0) {
                System.out.println("“5’e bölünen çift sayı”");
            } else {
                System.out.println("“5’e bölünen tek sayı”");
            }
        } else {
            System.out.println("Tekrar deneyin. Sayiniz 5'e tam bolunmuyor.");
        }


    }
}
