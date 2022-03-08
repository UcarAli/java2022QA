package day_15methodCreation;

import java.util.Scanner;

public class C09_MethodCreation {

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


        // eger bir method'dan bir islem yapmasini
        // ve yaptigi islemi bize getirmesini isterseniz
        // return type void degil, bize getirecegi sonucun data turunde olmalidir
        // Asagidaki metodlarda oldugu gibi

        String gizlenmisIsimSoyisim = isimSoyisimGizle(isim,soyisim);
        // bana isim ve soyismin gizlenmis halini getirmesini istiyorum
        // bekledigim donus String olur

        System.out.println(gizlenmisIsimSoyisim);

        String gizlenmisKKNo = kKartiGizle(kKNo);
        System.out.println(gizlenmisKKNo);

    }

    public static String isimSoyisimGizle(String isim, String soyisim) {
        String yeniIsim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim = soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");

        return yeniIsim + " " + yeniSoyisim;

        // method olusturmada 3.adim
        // method calisinca sadece birsey mi yazdiracak
        // yoksa bize bir data mi dondurecek buna karar vermektir
        // Bu soruda gizlenmis isim soyisim dondurmesi istendiginden
        // return Type'i void degil String sectik
        // ve method'un sonuna return edilecek datayi yazdik
    }

    private static String kKartiGizle(String kKNo) {
        String yeniKKNo = "**** **** **** "+ kKNo.substring(kKNo.length()-4);
        return yeniKKNo;
    }
}
