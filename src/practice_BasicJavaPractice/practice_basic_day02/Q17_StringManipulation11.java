package practice_BasicJavaPractice.practice_basic_day02;

import java.util.Scanner;

public class Q17_StringManipulation11 {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Isim :");
        String pNom = scan.nextLine();
        System.out.println("Soyisim :");
        String nom = scan.nextLine();

        if (pNom.length()>nom.length()){
            System.out.println("pNom = " + pNom);
        } else if (pNom.length()<nom.length()) {
            System.out.println("nom = " + nom);
        } else {
            System.out.println("isim soyisim uzunlugu esit");
        }
    }

}
