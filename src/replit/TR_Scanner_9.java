package replit;

import java.util.Scanner;

public class TR_Scanner_9 {
    /**
     * Girilen zamanı saniyeye çeviren bir program yazınız.
     * Örnek Çıktı:
     * 1 saat 10 dakika 50 saniye ==>
     * 4250 saniye
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("once saat sonra dk daha sonra saniye girin");
        int saat = scan.nextInt();
        int dakika = scan.nextInt();
        int saniye = scan.nextInt();

        System.out.println((saniye+(dakika*60)+(saat*60*60))+" saniye");

    }
}
