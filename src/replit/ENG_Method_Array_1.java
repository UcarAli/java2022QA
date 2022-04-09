package replit;

public class ENG_Method_Array_1 {
    /**
     * Write a return method to reverse number.
     * Input : 12345
     * Output : 54321
     */
    public static void main(String[] args) {
        String input="12345";



        System.out.println(terstenYazdir(input));

    }

    public static String terstenYazdir(String input){

        String newStr="";
        String arr[]=input.split("");

        for(int i =arr.length-1;i>=0;i--){
            newStr+=arr[i];


        }
        return newStr;
    }


}