package practice_AdvancedJavaPractice._06_Method_Creation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

/*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.

 */
        Scanner scan = new Scanner(System.in);
        System.out.println(" Ceviri yapacaginiz islemi seciniz : ");
        String islem = scan.next();
        System.out.println("Cevirim miktarini giriniz :");
        double miktar = scan.nextDouble() ;
        donustur(islem,miktar);

    }

    private static void donustur(String islem, double miktar) {
        switch (islem) {
            case "saat":
                System.out.println("merak ettigin saat " + miktar * 60 * 60 + " saniyedir");
                break;
            case "mil":
                System.out.println("merak ettigin mil " + miktar * 1.61 + " kilometredir");
                break;
            case "kg":
                System.out.println("merak ettigim kilo " + miktar * 1000 + " gramdir");
                break;
            default:
                System.out.println("dogru veri girmediniz ");
        }
    }
}

