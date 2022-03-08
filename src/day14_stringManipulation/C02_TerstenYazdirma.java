package day14_stringManipulation;

import java.util.Scanner;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi ilk harfi buyuk,
        // digerleri kucuk olarak tersten yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("4 harfli bir kelime girin.");
        String input = scan.next();

        if (input.length()!=4) {
            System.out.println("Lutfen 4 harflik bir kelime girin.");
        } else {
            String tersStr = input.substring(3).toUpperCase()
                    +input.substring(2,3).toLowerCase()
                    +input.substring(1,2).toLowerCase()
                    +input.substring(0,1).toLowerCase();

            System.out.println(tersStr);
        }





    }
}
