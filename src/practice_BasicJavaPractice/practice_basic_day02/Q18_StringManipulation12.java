package practice_BasicJavaPractice.practice_basic_day02;

import java.util.Scanner;

public class Q18_StringManipulation12 {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("String bir deger giriniz " );
        String str = scan.nextLine();

        if (str.isEmpty()) {
            System.out.println(" girdiginiz deger bos");
        }
        else if (str.contains(" ")) {
            System.out.println("Girdiginiz degerde bosluk var");
        } else if (str.isEmpty()) {
            System.out.println(" girdiginiz degerde bosluk yok");
        }

    }

}