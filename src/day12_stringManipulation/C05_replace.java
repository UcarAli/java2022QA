package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str = "Bugun ne cok sey ogrendik";


        System.out.println("space haric karakter sayisi : "+str.replace(" ", "").length());



        System.out.println("orjinal str karakter sayisi : "+ str.length());





        str = str.replace("Bugun", "Yarin");
        str = str.replace("ogrendik", "ogrenecegiz");

        System.out.println(str);

        str.replace("ne cok", "ne az");

        System.out.println(str);


    }
}
