package exercises;


import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {

        /* TASK :
        Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz
        (negatif sayilar da dahil olsun)
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("8 elemanli bir array girin");

        int arr[]=new int[8];

        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("bir eeleman girin");
            arr[i]= scan.nextInt();
            if (arr[i]%3==0){
                sayac++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("array de 3 bolunebilen eleman sayisi "+ sayac);







    }
}
