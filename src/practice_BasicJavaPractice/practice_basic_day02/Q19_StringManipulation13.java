package practice_BasicJavaPractice.practice_basic_day02;

import java.util.Locale;
import java.util.Scanner;

public class Q19_StringManipulation13 {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("4 harfli bir kelime girin :");
        String str = scan.next();

        terstenCevirme(str);


    }

    private static void terstenCevirme(String str) {
        String tersKelime= "";
        for (int i = 1; i <str.length()+1 ; i++) {
            tersKelime+= String.valueOf(str.charAt(str.length()-i));
        }
        System.out.print(tersKelime);
        System.out.println("");

        //substring()
        tersKelime= str.substring(3).toLowerCase()+ str.substring(2,3).toLowerCase()+str.substring(1,2)
                +str.substring(0,1);
        System.out.println("tersKelime = " + tersKelime);
    }
}
