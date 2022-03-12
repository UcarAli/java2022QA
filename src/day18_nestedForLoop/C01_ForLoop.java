package day18_nestedForLoop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {

        // Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
        // ve girilen sayinin faktoryel'ini bulun. (5!=5*4*3*2*1)

        Scanner scan = new Scanner(System.in);
        System.out.println("10 dan kucuk bir sayi girin");
        int input = scan.nextInt();

        int faktoryel = 1;
        String faktoryelAcikYazim = "";

        for (int i = input; i >=1 ; i--) {
            faktoryel *= i;

            if (i==input) {
                faktoryelAcikYazim = faktoryelAcikYazim + i;
            } else {
                faktoryelAcikYazim = faktoryelAcikYazim + "*" + i;
            }

        }

        System.out.println(input + "! = " + faktoryelAcikYazim + " =" + faktoryel);

    }
}
