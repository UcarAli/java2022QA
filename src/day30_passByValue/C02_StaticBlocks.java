package day30_passByValue;

public class C02_StaticBlocks {

    {
        /*
        static olmayan bloklar ise obje olusturulurken calisir

        static bloklar sadece 1 kere en basta calisir ama
        static olmayan bloklar her obje olusturulurken yeniden calisir
         */
        System.out.println("static olmayan block calisti");
    }
    static {
        System.out.println("static olan block calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method baslangici");

        C02_StaticBlocks obj1= new C02_StaticBlocks();
        C02_StaticBlocks obj2= new C02_StaticBlocks();


    }



}
