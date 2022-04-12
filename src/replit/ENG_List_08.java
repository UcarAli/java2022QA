package replit;

public class ENG_List_08 {
    /**
     * Write a java program which accept a sentence as parameter,
     * than reverses sentence by using StringBuilder and
     * checks if sentence is palindrome or not (without case sensitivity).
     * Use StringBuilder.
     *
     * Input :
     * I love Java.
     *
     * Output:
     * Reversed sentence : avaJ evol I. It is not a palindrome"
     */
    public static void main(String[] args) {
        StringBuilder input = new StringBuilder("I love Java.");

        if (input.toString().equalsIgnoreCase(input.reverse().toString())){
            System.out.println("Reversed sentence : "+input.reverse()+" It is a palindrome");
        } else{
            System.out.println("Reversed sentence : "+input.reverse()+" It is not a palindrome");
        }








        






    }


}
