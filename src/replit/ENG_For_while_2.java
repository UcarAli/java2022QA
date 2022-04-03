package replit;

import java.util.Scanner;

class ENG_For_while_2 {

    public static void main(String[] args) {
        /**
         * Ask user to enter 2 integer then find GCD (Greatest Common Divisor)
         * and LCM (Least Common Multiple)
         *
         * Input :
         * 30 and 40
         *
         * Expected OutPut:
         * GCD for 30 and 40 = 10
         * LCM for 30 and 40 = 120
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("enter 2 integer :");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int gcd=1;
        int lcm=1;

        for (int i = 2; i <=sayi1 && i<=sayi2 ; i++) {
            if (sayi1 % i == 0 &&sayi2%i==0) {
                gcd=i;
            }
        }
        lcm=sayi1*sayi2/gcd;
        System.out.println("GCD for "+sayi1+" and "+sayi2+" = "+gcd);
        System.out.println("LCM for "+sayi1+" and "+sayi2+" = "+lcm);


    }
}