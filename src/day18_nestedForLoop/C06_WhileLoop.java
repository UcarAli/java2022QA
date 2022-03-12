package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan 2 farkli tam sayi alip
        // bu sayilari ve aralarindaki butun tam sayilari yazdirin


        // for loop ile yapilisi
        int baslangic = 40;
        int bitis = 60;

        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");


        // Ayni soruyu while loop ile yapalim

        int i = baslangic; // bunu eklememizin nedeni baslangic degerinin degistirmemek
        while (i<=bitis) {
            System.out.print(i+" ");
            i++;
        }
        System.out.println("");
        System.out.println(baslangic);

    }
}
