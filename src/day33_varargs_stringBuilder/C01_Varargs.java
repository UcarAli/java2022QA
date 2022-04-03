package day33_varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {
        // kac tane String verilirse verilsin
        // iclerinden en uzun olani yazdiran bir method olusturun
        String str1="Ali";
        String str2="Veli";
        String str3 = "Oguzhan";
        String str4 = "Samet";

        // Yazilan argument sayisi sabitse herzamanki gibi bir method olusturabiliriz
        // ancak argument sayisinin degisme ihtimali varsa
        // o zaman varargs tercih edilir
        enUzunKelime(str1,str2,str3);

    }

    private static void enUzunKelime(String... sr) {
        String enUzun="";
        for (String each: sr
             ) {
            if (each.length()>enUzun.length()){
                enUzun=each;
            }
        }
        System.out.println("enUzun Kelime= " + enUzun);

    }
}
