package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // Scanner kullanmak icin 3 adim takip ederiz
        // 1. adim kendimize bir scanner olusturmak
        Scanner scan = new Scanner(System.in);  // esitligin sagina yeni bir scanner olusturulur
                                                // ve olusturulan bu scanner scan variable'na assign edilir
                                                // scan variable'in ismidir, istedigimiz isim verebiliriz

        // 2. adim : Kullaniciya deger girmesi icin aciklayici bilgi yazisi
        System.out.println("Isminiz nedir,yaziniz");

        // 3. adim kullanicinin girdigi degeri uygun bir variable olusturup kaydedin
        // String isim= scan.next();  // SADECE ilk kelimeyi alir (ilk space'e kadar olan bolumu alir)

        String isim=scan.nextLine(); // satir sonuna kadar girilen tum degerleri alir

        System.out.println(isim);



    }
}
