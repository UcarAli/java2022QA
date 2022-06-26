package replit;

import java.util.Scanner;

public class TR_For_while_5 {
    /**
     * Print even numbers from 20 to 0 but do not use decrement (i--).
     *
     * OUTPUT  : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
     */
    public static void main(String[] args) {
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
