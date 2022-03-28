package day28_constructor;

public class StaticKeyword {
    static int sayi1;
    int sayi2;

    public static void main(String[] args) {

        System.out.println("sayi1 = " + sayi1);
//        System.out.println("sayi2 = " + sayi2);
        StaticKeyword obj1 =new StaticKeyword();
        System.out.println(obj1.sayi2);

    }

}
