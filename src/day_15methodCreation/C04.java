package day_15methodCreation;

public class C04 {

        // main method olmadan da bir class olusturulabilir
        // Ancak bu class direk calismaz
        // sadece depo gorevi gorur
        // baska class'lardan kullanilabilecek method veya variable'lari barindirir

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime= kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);

        System.out.println("Kelimedeki harf sayisi : 4");
        System.out.println("Kelimenin tersten yazilisi : "+ tersKelime);
    }

    public static void ucHarfiTersineCevir(String kelime) {
        String tersKelime= kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);

        System.out.println("Kelimedeki harf sayisi : 3");
        System.out.println("Kelimenin tersten yazilisi : "+ tersKelime);
    }


}
