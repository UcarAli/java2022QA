package day06_concatenation_Operators;

public class C02_MantikOperatorleri {
    public static void main(String[] args) {

        // && ve & farki. -> sonuc degismez. && de false cikinca islemi durdurur, & de islemi sonuna kadar gider.
        System.out.println(5+2==8);     // false

        boolean sonuc1= 5>4 && 7<9&&6+3==9&&5+2!=8;  // true
        System.out.println(sonuc1);

        boolean sonuc2= 5>4 && 7>9&&6+3==9&&5+2!=8;  // false
        System.out.println(sonuc2);

        boolean sonuc3= 5>4 & 7>9 & 6+3==9 & 5+2!=8;  // false
        System.out.println(sonuc3);





        int sayi3= 15;
        // sayi3'un ' 10 ile 20 araliginda oldugunu true diyerek dondurelim
        // java uclu karsilastirma kabiul etmez
        // ikili karsilastirmalar yapip mantiksal operatorlerle birlestirmeliyiz
        System.out.println(10<sayi3   &&    sayi3<20); // true
        int sayi4=5;
        // sayi4 un 10 ile 20'in arasinda olmadigini true diyerek dondurelim
        System.out.println(sayi4<10 || sayi4>20); // true




    }

}
