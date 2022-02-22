package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        // Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini
        // hesaplayip yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("yaricapi yaziniz");
        double r= scan.nextDouble();

        System.out.println("yaricap: "+r+"cm");
        System.out.println("cevre: "+ 2*3.14*r+"cm");
        System.out.println("alan: "+ 3.14*r*r+"cm2");

    }
}
