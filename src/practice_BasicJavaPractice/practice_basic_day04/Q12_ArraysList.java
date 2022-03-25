package practice_BasicJavaPractice.practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_ArraysList {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("list uzunlugunu giriniz : ");
        int listLenght = scan.nextInt();

        List<Integer>  list = new ArrayList<>();
        System.out.println("list elemanlarini tek tek girin");

        for (int i = 0; i < listLenght; i++) {
            System.out.println("list in "+(i+1)+". eleman giriniz");
            list.add(scan.nextInt());
        }
        System.out.println("list = " + list);

        tekraliEleman(list);

    }

    private static void tekraliEleman(List<Integer> list) {
        List<Integer> tekrarliList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) == list.get(j) && !tekrarliList.contains(list.get(i))) {
                    tekrarliList.add(list.get(i));
                }
            }
        }
        System.out.println("tekrarliList = " + tekrarliList);
    }
}
