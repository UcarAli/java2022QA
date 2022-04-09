package replit;

import java.util.Scanner;

public class TR_For_while_3 {
    /**
     * Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
     * Input :
     * String str=“Javaisalsoeasy”
     * Output: a s
     */
    public static void main(String[] args) {
        String str="Javaisalsoeasy";
        String output = "";

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j) && !output.contains(str.substring(i,i+1))){
                    output+=str.charAt(i)+" ";
                }
            }

        }
        System.out.println(output);

    }
}
