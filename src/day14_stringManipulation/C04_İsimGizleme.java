package day14_stringManipulation;

import java.util.Scanner;

public class C04_İsimGizleme {
    public static void main(String[] args) {

        /*
        Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin
        ve asagidaki gibi yazdirin
        isim-soyisim : M***** B*******
        kart no : **** **** **** 1234
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz.");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz.");
        String soyisim= scan.nextLine();
        System.out.println("Lutfen kart no giriniz.");
        String kKNo= scan.nextLine();

        String yeniIsim = isim.substring(0,1).toUpperCase()+
                          isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim = soyisim.substring(0,1).toUpperCase()+
                             soyisim.substring(1).replaceAll("\\S","*");
        String yeniKKNo = "**** **** **** "+ kKNo.substring(kKNo.length()-4);

        System.out.println("Isim-Soyisim : "+yeniIsim+" "+yeniSoyisim+
                            "\nKart No : "+ yeniKKNo);






    }
}
