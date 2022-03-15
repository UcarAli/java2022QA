package day20_scope_Arrays;

public class C02_StaticVariables {

    /**
     *  instance variable'lar obje'ye bagimlidir ve her obje
     *  farkli degerler alabilir
     *  ogrenci notlari veya ogretmen branslari gibi
     *  bir objeye ait bir variable'in son degerini bulmak icin
     *  sadece o objeyi dikkate aliriz
     *
     *  Static variabler ise class variable olarak tanımlanir
     *  ve tum class uyeleri icin aynıdir. Okul ismi,okul muduru adi gibi
     *  eger statatic variable'in degeri degistirilirse herkes icin degisir
     */

    static String okulIsmi="Yildiz koleji";
    static int okulNo;
    static boolean okulAcikMi;

    public static void main(String[] args) {
        System.out.println(okulIsmi ); // Yildiz koleji
        System.out.println(okulNo); // 0
        okulNo = 102;
        System.out.println(okulNo); // 102
        System.out.println(okulAcikMi); // false

        staticMethod();

        System.out.println(okulNo); // 200

    }

    public static void staticMethod () {
        okulNo = 200;
        System.out.println(okulNo); // 200


    }


}
