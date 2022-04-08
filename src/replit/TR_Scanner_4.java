package replit;

import java.util.Scanner;

public class TR_Scanner_4 {
    /**
     * Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
     * Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
     *
     * 1 şeker = 1.7 gr
     *
     * Örnek Çıktı:
     * Yılda 12.41 kg şeker kullanıyor.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("günde kac bardak çay içiyorsunuz");
        int cay= scan.nextInt();
        System.out.println("bir bardak çaya kac seker atiyorsunuz");
        int seker= scan.nextInt();
        double kupSeker = 1.7;
        System.out.println("Yilda "+((kupSeker*cay*seker*365)/1000)+" kg seker kullaniyor.");


    }
}
