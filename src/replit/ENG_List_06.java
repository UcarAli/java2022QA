package replit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ENG_List_06 {
    /**
     * Write a program to find the common elements
     * between two String Arrays (without case sensitivity)
     *
     * Input1 : {John,Brad,Ange,Sofia,Emily}
     *
     * Input2 : {sofia,brad,grace,emily,hazel}
     *
     * Output : [sofia,brad,emily]
     */
    public static void main(String[] args) {
        String[] input1 = {"John","Brad","Ange","Sofia","Emily"};
        String[] input2 = {"sofia","brad","grace","emily","hazel"};
        List<String> output=new ArrayList<>();
        for(String each1 : input2){
            for(String each2 : input1){
                if (each1.equalsIgnoreCase(each2)){
                    output.add(each1);
                }
            }
        }

        System.out.println(output);







        






    }


}
