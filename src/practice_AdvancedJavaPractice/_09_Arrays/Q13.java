package practice_AdvancedJavaPractice._09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)
        */

        int arr[] = new int[8];//8 elemanlı bos int type array cretae edildi
        Scanner scan = new Scanner(System.in);
        System.out.println("8 elemanli bir array giriniz");

        int sayac = 0;
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i+". index i giriniz :");
            arr[i] = scan.nextInt();
            if (arr[i]%3==0) {
                sayac++;
            }
        }
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("3 e bolunebilen eleman adedi = " + sayac);


    }

}
