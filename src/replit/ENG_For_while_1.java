package replit;

import java.util.Scanner;

class ENG_For_while_1 {
    public static void main(String[] args) {
        /**
         * Ask user to enter a name and a character,
         * then check how many times the character is repeated
         * in the name using loops in the name
         *
         * e.g:
         *
         * char ch1= 'a' ;
         *
         * String name =“John came late"
         *
         * Expected Output: Number of a = 2
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a name :");
        String name = scan.nextLine();
        System.out.println("enter a character :");
        char ch1 = scan.next().charAt(0);

        int sayac=0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ch1) {
                sayac++;
            }
        }
        System.out.println("number of "+ch1+" = "+sayac);




    }
}