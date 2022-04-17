package practice_AdvancedJavaPractice._09_Arrays;

import java.util.Arrays;

public class Q10 {

    public static void main(String[] args) {
        /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )

         */

        String str = "GayetBasarılı";
        String arr[]=str.split("Gayet");
        //System.out.println("arr = " + Arrays.toString(arr));
        arr[0]="Coook";
        System.out.println("arr = " + Arrays.toString(arr));

        String newStr=arr[0]+arr[1];
        System.out.println("newStr = " + newStr);

        String arr2[]=new String[1];
        arr2[0]=arr[0]+arr[1];
        System.out.println("arr2 = " + Arrays.toString(arr2));






    }

}
