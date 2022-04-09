package replit;

import java.util.Scanner;

public class TR_Scanner_8 {
    /**
     * Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.
     * Örnek Çıktı:
     * Verilen tamsayının rakamları toplamı 10'dur.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("üç basamaklı bir sayı girin");
        int input = scan.nextInt();
        int bsmTpl=0;


        while(input>0){
            bsmTpl+=input%10;
            input/=10;
        }

        System.out.println("Verilen tamsayinin rakamlari toplami "+bsmTpl+"'dur.");

    }
}
