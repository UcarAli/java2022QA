package day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_length {
    public static void main(String[] args) {

        // Kullanicidan ismini alip basharfini ve son harfini Buyuk harflerle yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("Ilk harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0) );
        System.out.println("Son harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1) );

        String str1 = "";
        System.out.println(str1.length()); // 0

        String str2 = null;
        // System.out.println(str2.length()); // calistirinca hata verir

        String str3;
        // System.out.println(str3);
        // str3 ile str2'ye deger atanmamistir
        // str2 null pointer ile isaretlendiginden java durumun kontrol altinda oldugu bilir
        // ve geriye kalan kodun calismasina engel olmaz
        // ancak str3' e bir deger atamasi olmayinca java altini kirmizi cizer
        // ve bu durum duzeltilinceye kadar kodun geriye kalaninin calismasinada izin vermez
    }
}







