package exercises;


import java.util.Arrays;

public class C09 {

    public static void main(String[] args) {
        /**
         * Ask user to enter 2 integer then find GCD (Greatest Common Divisor)
         * and LCM (Least Common Multiple)
         *
         * Input :
         *
         * 30 and 40
         *
         * Expected OutPut:
         *
         * GCD for 30 and 40 = 10
         *
         * LCM for 30 and 40 = 120
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
