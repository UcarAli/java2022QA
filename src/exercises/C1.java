package exercises;


import java.util.Scanner;

public class C1 {
    /**
     *
     * 	 Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder
     *    and checks if sentence is palindrome or not
     *    (without case sensitivity)
     *    Eg : input : I love Java
     *    Output: "Reversed sentence : avaJ evol I .
     *    It is not a palindrome"
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();

        StringBuilder input = new StringBuilder(str);

        if (input.toString().equalsIgnoreCase(input.reverse().toString())){
            System.out.println(input);
            System.out.println("It is a palindrome");

        }else {
            System.out.println(input);
            System.out.println("It is not a palindrome");
        }
        System.out.println(input.equals(input));






    }
}
