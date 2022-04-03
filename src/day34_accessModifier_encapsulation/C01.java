package day34_accessModifier_encapsulation;

public class C01 {
    private  static  int sayi =10;
    private  static String str ="Java";

    static int acikSayi=20;  // access modifier'i default Access Modifier
    String acikString="Hi"; // access modifier'i default Access Modifier
    public static int halkaAcikSayi=15;
    protected static int aileyeOzel=40;

    protected C01() { // protected anlatmak icin C01 basina protected yazdi. ancak altta yorum defaul icin olugundan bu sekilde yoruma aldim
    // C01() { // C02_AccessModifier class anlatirken kullanildi ancak protected anlatirken kapatmak gerekti
        // bu constructor'in access modifier'i
        // default access modifier'dir
        // dolayisiyla icinde oldugumuz paketin disinda
        // bu class'dan obje olusturulamaz

    }


     private C01(int numara){
        System.out.println("parametreli Constructor calisti");
    }

    private void method1(){

    }
}
