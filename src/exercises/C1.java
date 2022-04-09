package exercises;

import java.util.Arrays;
import java.util.List;

public class C1 {

    public static void main(String[] args) {

        String  input ="eeewaaaq";
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
            }else if(sayac==sayac2){
                maxHarf=maxHarf+", "+list.get(i);
            }
            sayac=0;


        }
        System.out.println("maximum occurring character is : "+maxHarf);




    }
}
