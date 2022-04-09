package replit;

import java.util.Scanner;

public class TR_Scanner_10 {
    /**
     * Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
     * INPUT:
     * Dakika sayısı: 3456789
     * OUTPUT :
     * 3456789 dakika yaklaşık 6 yıl 210 gündür
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dakika sayısı: ");
        int dakika = scan.nextInt();
        int yil = 0;
        int gun = 0;

        if(dakika>=(24*60)){
            gun=dakika/(24*60);
        }
        if(gun>=365){
            yil=gun/365;
            gun =gun%365;
        }

        System.out.println(dakika+" dakika yaklasik "+yil+" yil "+gun+" gundur");

    }
}
