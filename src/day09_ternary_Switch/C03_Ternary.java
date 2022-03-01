package day09_ternary_Switch;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz.");

        int sayi=scan.nextInt();
        // verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol eden
        // ve sonucu yazdiran bir ternary olusturun

        String sonuc =sayi>=100 ? "Sayi 3 basamakli veya daha buyuk" : "sayi 3 basamaktan kucuk veya negatif";

        // Ternary bize sonuc dondurdugu icin
        // ya bu sonucu direk yazdirmaliyiz
        // ya da sonucun data turune uygun bir variable'a  atama yapabiliriz

        System.out.println("girdiginiz sayi analizi : " + sonuc);
    }
}
