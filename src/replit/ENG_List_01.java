package replit;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ENG_List_01 {
    /**
     * Write a Java program to get a String from user as input and
     * find the maximum occurring character in that string.
     * (Ignore case sensitivity)
     *
     * input :
     * Learning java is easy
     *
     * output:
     * maximum occurring character is : a
     *
     */
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
        //System.out.println("enter a sentence");
        //String input= scan.nextLine();
        String  input ="Learning java is easy";
        String arr[]=input.split("");

        List<String> list = Arrays.asList(arr);

        int sayac=0;
        int sayac2=0;
        String maxHarf="";


        for(int i=0; i<list.size();i++){
            for (int j=i+1;j<list.size();j++){
                if(list.get(i).equalsIgnoreCase(list.get(j))){
                    sayac++;
                }
            }
            if(sayac>sayac2){
                sayac2=sayac;
                maxHarf=list.get(i);
            }
//            else if(sayac==sayac2){
//                maxHarf=maxHarf+", "+list.get(i);
//            }

            sayac=0;


        }
        System.out.println("maximum occurring character is : "+maxHarf);


    }
}
