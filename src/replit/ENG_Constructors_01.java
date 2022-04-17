package replit;

import java.util.Locale;
import java.util.Scanner;

public class ENG_Constructors_01 {
    /*****************************************************
     * Write a Scrabble Game for two person
     *  Rules
     * OK== 1- At the beginning Ask to first Player enter a word for starting game
     * OK 2- Then change the player ask to new player if given word is valid or not
     * OK		i) If new player accepts the given word add number of letters in the
     *            word as points to player who wrote the word And go to step 3
     * OK     ii) If new player  does not accept the word as valid then print
     *           "Invalid word, player X(Current player) won the game" and
     *           finish the game
     *
     * OK  3- Ask to users if user want to continue game or not
     * OK     i) If player want to continue,
     *          ask to user a letter to add to word
     *          and ask to user side to add (beginning or end)
     *          then add letter to word and run step 2
     *
     * OK    ii) If player does not want to continue
     *          then print "Game Finished" and print points  and winner
     ************************************************************/

    static int player1_Puan;
    static int player2_Puan;
    static String word;
    static String kelimeOnay;
    static String harf;
    static int tercihHarf1;
    static int tercihHarf2;
    static int tercihdevam1;
    static int tercihdevam2;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("***Scrable Oyunu***");
        System.out.println("Hosgeldin 1. oyuncu. \nOyunu baslatmak icin bir kelime girmelisiniz.");
        word = scan.next();
        System.out.println("Hosgeldin 2. oyuncu. \n1. oyuncunun girdigi kelime : " + word + "\nBu kelime gecerli bir kelimeyse E degilse H giriniz");
        // kelimeOnay = scan.nextLine().toUpperCase(Locale.ROOT);
        kelimeOnay = scan.next().toUpperCase();
        switch (kelimeOnay) {
            case "E" :
                puanekleme1oyuncu();
                break;
            case "H":
                sonuc();
                break;
            default:
                System.out.println("Lutfen gecerli");
        }

        ikincioyuncuHarfgirmetodu();
    }





    private static void sonuc() {
        if (player1_Puan > player2_Puan) {
            System.out.println("Invalid word,end the game");
            System.out.println(player1_Puan + " puan ile player1 kazandi");
        } else if (player1_Puan < player2_Puan) {
            System.out.println("Invalid word,end the game");
            System.out.println(player2_Puan + " puan ile player2 kazandi");
        } else if (player1_Puan == player2_Puan) {
            System.out.println("Invalid word,end the game");
            System.out.println(" esit puan berabere");
        }


    }



    private static void puanekleme1oyuncu() {
        player1_Puan += word.length();
    }



    private static void puanekleme2oyuncu() {
        player2_Puan += word.length();
    }





    private static void birincioyuncuHarfgirmetodu() {
        System.out.println("birinci oyuncu gecerli bir harf giriniz");
        harf = scan.nextLine();
        System.out.println(harf + " harfi kelimenin basina gelmesi icin 1 && sonu icin 2 giriniz");
        tercihHarf1 = scan.nextInt();
        String s = tercihHarf1 == 2 ? (word = word.concat(harf)) : (word = harf.concat(word));


        System.out.println("ikinci oyuncu==> " + word + " kelimesi kabul ise 1 degilse 2 giriniz");
        tercihdevam2=scan.nextInt();
        if (tercihdevam2 == 1) {
            puanekleme1oyuncu();
            ikincioyuncuHarfgirmetodu();


        } else if (tercihdevam2 == 2) {
            sonuc();
        }
    }



    private static void ikincioyuncuHarfgirmetodu() {
        System.out.println("ikinci oyucu gecerli bir harf giriniz");
        harf = scan.nextLine();
        System.out.println(harf + " harfi kelimenin basina gelmesi icin 1 && sonu icin 2 giriniz");
        tercihHarf2 = scan.nextInt();
        String s = tercihHarf2 == 2 ? (word = word.concat(harf)) : (word = harf.concat(word));

        System.out.println("birinci oyuncu==> " + word + " kelimesi kabul ise 1 degilse 2 giriniz");
        tercihdevam1=scan.nextInt();
        if (tercihdevam1 == 1) {
            puanekleme2oyuncu();
            birincioyuncuHarfgirmetodu();
        } else if (tercihdevam1== 2) {
            sonuc();
        }}

}