package day10_Switch_StringManipulation;

import java.util.Locale;

public class C04_charAt {
    public static void main(String[] args) {

        // String de herhangi bir karakteri almak istedigimizde
        // o harfin index ini kullanarak
        // str.charAt(istenenIndex) yazabiliriz

        String str= "Java Cok Guzel";

        // J yi yazdiralim
        System.out.println(str.charAt(0));

        // G yi yazdiralim
        System.out.println(str.charAt(9));

        // va yi yazdiralim
        System.out.println(str.charAt(2)+str.charAt(3)); // 215 yazdirir. ASCII topladi
        System.out.println(""+str.charAt(2)+str.charAt(3)); // va yazar. Bossluk hiclik, maksat String yapmak. yaksa char lar ascii deg toplar

        // cOK seklinde yazdiralim
        System.out.println(str.toLowerCase().charAt(5)+
                ""+str.toUpperCase().charAt(6)+
                str.toUpperCase().charAt(7));

        System.out.println(str.length());
        System.out.println(str+str.length());

        // son karakteri yazdir
        // String'de 14 harf var, son harfin indexi 14-1
        System.out.println(str.charAt(14-1)); // uzunluk -1
        // eger uzunlugu index olarak girersek
        // java calistiktan sonra hata verir
        System.out.println(str.charAt(14));

    }
}
