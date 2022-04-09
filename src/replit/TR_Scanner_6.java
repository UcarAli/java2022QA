package replit;

import java.util.Scanner;

public class TR_Scanner_6 {
    /**
     * Kullanıcıdan bir Float değer girmesini isteyin,
     * bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir Float değer girin");
        float input=scan.nextFloat();
        short shr=(short) input;
        System.out.println(shr);

    }
}
