package practice_AdvancedJavaPractice._09_Arrays;

import java.util.Arrays;

public class Q16 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

        String str="ade1r4d3";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i].charAt(0))) { // arr[i] String bir ifade oldugundan charAt(0) kullanarak char a cevirdik. Cunku isDigit() char ile calisir
                toplam+=Integer.valueOf(arr[i]);
            }
        }
        System.out.println("toplam = " + toplam);


    }
}

