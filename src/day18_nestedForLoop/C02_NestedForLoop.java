package day18_nestedForLoop;

import java.util.Scanner;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        // Kullanicidan bir rakam isteyip carpim toplasu olusturalim
        // 1 2 3         1*1  1*2  1*3
        // 2 4 6         2*1  2*2  2*3
        // 3 6 9         3*1  3*2  3*3

        Scanner scan = new Scanner(System.in);
        System.out.println("10 dan kucuk bir sayi girin");
        int input = scan.nextInt();

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <= input ; j++) {
                System.out.print(i+"*"+j+"="+(i*j)+"   ");
            }
            System.out.println(""); // Satiri asagiya atamasi icin
        }






    }
}
