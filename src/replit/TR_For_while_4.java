package replit;

import java.util.Scanner;

public class TR_For_while_4 {
    /**
     * Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
     *
     * Input : 6
     *
     * Output: 6!=65432*1=720
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
