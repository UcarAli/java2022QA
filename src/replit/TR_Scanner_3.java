package replit;

import java.util.Scanner;

public class TR_Scanner_3 {
    /**
     * Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.
     *
     * Örnek Çıktı:
     * Alan: 32
     * Çevre: 24
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("dikdortgenin a kenarini girin");
        int aKenar = scan.nextInt();
        System.out.println("dikdortgenin b kenarini girin");
        int bKenar = scan.nextInt();

        System.out.println("Alan: "+(aKenar*bKenar));
        System.out.println("Cevre: "+(2*(aKenar+bKenar)));


    }
}