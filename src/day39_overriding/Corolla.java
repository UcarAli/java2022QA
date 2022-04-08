package day39_overriding;

public class Corolla extends Toyota {
    protected String hiz="Corolla max 200 km hiz yapar.";
    protected String yakit="Corolla benzinli veya elektriklidir.";
    protected String model="Corolla";

    public void motor(){
        System.out.println("Corolla araclar cevreci motor kullanir.");
    }

    public void yakitTuketimi(){
        System.out.println("Corolla 5.6 lt yakit tuketir.");
    }

    public void vitesSayisi(){
        System.out.println("Corolla 5 viteslidir.");
    }

    public static void main(String[] args) {

        /*
        Data turu ve constructor farkli oldugunda
        Constructor calistigi icin obje
        Constructor'in oldugu class ozelliklerini tasir
        ancak Data turu Parent class secildigi icin
        variable'lar data turunun secildigi class ve
        onun parent class'larindan deger alabilir

        Method'lar icin ise yine Data turunun oldugu class'a gideriz
        ancak direk method'u calistirmadan once
        method Override edilmis mi diye kontrol ederiz
         */

        Corolla arb1 = new Corolla();
        System.out.println(arb1.hareket); // Araba class
        System.out.println(arb1.hiz); // Corolla class
        System.out.println(arb1.yakit); // Corolla class
        System.out.println(arb1.marka); // Toyota class
        System.out.println(arb1.sirketMerkezi); // Toyota class
        System.out.println(arb1.model); // Corolla class
        arb1.motor(); // Corolla class

        System.out.println("");

        Toyota arb2 = new Corolla();
        System.out.println(arb2.hareket); // Araba class
        System.out.println(arb2.hiz); // Toyota class
        System.out.println(arb2.yakit); // Araba class
        System.out.println(arb2.marka); // Toyota class
        System.out.println(arb2.sirketMerkezi); // Toyota class
        // System.out.println(arb2.model); // CTE verir. Cunku Toyota ve parent class i Araba da model variable yok.Corolla clasina geri gelmez.
        arb2.motor(); // Corolla class
        arb2.garanti(); // Toyota class
        arb2.yakitTuketimi(); // Corolla class
        // arb2.vitesSayisi(); // CTE verir. data turu olan Toyota class dan baslayinca boyle bir method bulamadik

        System.out.println("");

        Araba arb3 = new Corolla();
        System.out.println(arb3.hareket); // Araba class
        System.out.println(arb3.hiz); // Araba class
        System.out.println(arb3.yakit); // Araba class
        System.out.println(arb3.marka); // Araba class
        // System.out.println(arb3.sirketMerkezi); // CTE verir. Cunku Araba class inda bu variable yok. child class a geri gelmez.
        // System.out.println(arb3.model); // CTE verir. Cunku Araba class inda bu variable yok. child class a geri gelmez.
        arb3.yakitTuketimi(); // Corolla class
        arb3.motor(); // Corolla class
        // arb3.garanti(); // CTE verir. Cunku Araba class inda bu method yok. child class a geri gelmez.
        // arb3.vitesSayisi(); // CTE verir. Cunku Araba class inda bu method yok. child class a geri gelmez.




    }




}
