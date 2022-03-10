package day17_forLoop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
        // 10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda
        // virgul olarak ayni satirda yazdirin

        for (int i = 10; i <=29 ; i++) {
            System.out.print(i+", ");
        }
        System.out.println(30);

        // benim kod
        for (int i = 10; i <=30 ; i++) {
            if (i<30) {
                System.out.print(i+", ");
            } else System.out.println(i);
        }


        int baslangic= 15;
        int bitis = 35;
        for (int i = baslangic; i <=bitis ; i++) {
            if (i<bitis) {
                System.out.print(i+", ");
            } else {
                System.out.println(i);
            }

        }


        // benim kod
        Scanner scan = new Scanner(System.in);
        System.out.println("balangic sayisini giriniz");
        int baslangic2= scan.nextInt();
        System.out.println("bitis sayisini giriniz");
        int bitis2 = scan.nextInt();
        for (int i = baslangic2; i <=bitis2 ; i++) {
            if (i<bitis2) {
                System.out.print(i+", ");
            } else {
                System.out.println(i);
            }

        }



    }
}
