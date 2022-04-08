package replit;

public class TR_SYSO_7 {
    /**
     * Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)
     * int a= 3;
     * int b= 5;
     * Ornek Cikti:
     * a=5
     * b=3
     */
    public static void main(String[] args) {
        int a= 3;
        int b= 5;
        int c;

        c=b;
        b=a;
        a=c;
        System.out.println("a="+a);
        System.out.println("b="+b);


    }
}
