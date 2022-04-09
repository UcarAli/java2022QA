package replit;

import java.util.Scanner;

public class TR_Scanner_7 {
    /**
     * Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir DOUBLE  değer girin");
        double input = scan.nextDouble();

        int output = (int) input;
        System.out.println(output);

    }
}
