package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ENG_List_05 {
    /**
     * Write a program that accepts an integer as input and
     * prints first 10 prime numbers greater than input
     * Check numbers if they are even or not in a return method.
     *
     * Input : 5
     *
     * Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int input= scan.nextInt();

        int sayac10adet=0;
        input++;

        List<Integer> numbers=new ArrayList<Integer>();

        while (sayac10adet<10){
            int sayac=0;
            for (int i = 2; i < input; i++) {
                if (input%i==0){
                    sayac++;
                }
            }
            if(sayac==0){
                numbers.add(input);
                sayac10adet++;
            }
            input++;

        }
        System.out.println(numbers);


        






    }


}
