package replit;

import java.util.Scanner;

class ENG_For_while_4 {

    public static void main(String[] args) {
        /**
         * Write a return method that accepts an integer as input and calculates factorial and prints like output.
         *
         * Input : 6
         *
         * Output: 6!=6*5*4*3*2*1=720
         */


        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz :");
        int input=scan.nextInt();
        //int input = 6;
        int faktoriyel=1;
        String output=input+"!="+input;

        for(int i =1;i<=input;i++){
            faktoriyel*=i;
            if(i<input){
                output=output+"*"+(input-i);
            }
        }
        System.out.println(output+"="+faktoriyel);

    }
}