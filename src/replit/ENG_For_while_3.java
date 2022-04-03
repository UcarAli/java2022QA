package replit;

import java.util.Arrays;
import java.util.Scanner;

class ENG_For_while_3 {

    public static void main(String[] args) {
        /**
         * Write a code that returns the duplicate chars in a String array.(interview Question)
         *
         * Input :
         *
         * String str=“Javaisalsoeasy”
         *
         * Output: [a, s]
         */

        String str="Javaisalsoeasy";
        String strTekrarsiz="";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j)) {
                    // Benim cozum
                    // strTekrarsiz+=str.charAt(i);
                    // str = str.replaceAll(Character.toString(str.charAt(i)), "");

                    // veya
                    if (!strTekrarsiz.contains(str.substring(i,i+1))){
                        strTekrarsiz += str.charAt(i);
                    }
                }
            }

        }
        String arr[]=strTekrarsiz.split("");
        System.out.println(Arrays.toString(arr));


    }
}