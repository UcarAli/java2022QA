package replit;

import java.util.Scanner;

public class ENG_StringBuilder_01 {
    /**
     * Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder
     *    and checks if sentence is palindrome or not
     *    (without case sensitivity)
     *    Eg : input : I love Java
     *    Output: "Reversed sentence : avaJ evol I .
     *    It is not a palindrome"
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a sentence");
        String str= scan.nextLine();

        StringBuilder input = new StringBuilder(str);

        if (input.toString().equalsIgnoreCase(input.reverse().toString())){
            System.out.println(input);
            System.out.println("It is a palindrome");
        } else{
            System.out.println(input);
            System.out.println("It is not a palindrome");
        }

//        if(input.toString().contains("ç")){
//            int index = input.indexOf("ç");
//            input=input.replace(index,index+1,"c");
//        }
//
//        if(input.toString().contains(".")){
//            int index = input.indexOf(".");
//            input=input.replace(index,index+1,"");
//
//            if (input.toString().equalsIgnoreCase(input.reverse().toString())){
//                input=input.append(".");
//                System.out.println(input);
//                System.out.println("It is a palindrome");
//            } else{
//                input=input.append(".");
//                System.out.println(input);
//                System.out.println("It is not a palindrome");
//            }
//        }else if (input.toString().equalsIgnoreCase(input.reverse().toString())){
//            System.out.println(input);
//            System.out.println("It is a palindrome");
//        } else{
//            System.out.println(input);
//            System.out.println("It is not a palindrome");
//        }

    }
}