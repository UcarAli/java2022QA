package replit;

import java.util.Arrays;
import java.util.List;

public class ENG_List_01 {

    public static void main(String[] args) {

        String str ="Learning java is easy";
        String arr[]=str.split("");
        List<String> list = Arrays.asList(arr);

        int sayac=0;
        int maxSayac=0;
        String maxChar="";

        for (int i = 0; i < list.size() ; i++) {
            for (int j = i+1; j < list.size() ; j++) {
                if (list.get(i).contains(list.get(j))){
                    sayac++;
                }

            }
            if (sayac>maxSayac){
                maxSayac++;
                maxChar= list.get(i);
            }
            sayac=0;
        }
        System.out.println("maximum occurring character is : "+maxChar);


    }
}
