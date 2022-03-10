package day04_dataCasting_Increment;

public class Exercise {
    public static void main(String[] args) {

        //        Soru 1 ) byte veri tipinde bir degisken olusturun,
        //        short,int,float ve double data tiplerinde
        //        birer degisken olusturup adim adim widening yapin ve yazdirin
        byte bytS1= 120;
        System.out.println(bytS1);
        short shrS1 = bytS1;
        System.out.println(shrS1);
        int intS1= shrS1;
        System.out.println(intS1);
        float fltS1= intS1;
        System.out.println(fltS1);
        double dblS1= fltS1;
        System.out.println(dblS1);


        //        Soru 2 ) int veri turunde bir degisken olusturun ve
        //        adim adim narrowing yapin ve yazdirin
        int intS2= 211;
        short shrS2 = (short) intS2;
        System.out.println(shrS2);
        byte bytS2 = (byte) shrS2;
        System.out.println(bytS2);
        char a = (char) bytS2;
        System.out.println(a);


        //        Soru 3 ) Float data turunde bir variable olusturun ve yazdirin
        float fltS3 = 12.22123f;
        System.out.println(fltS3);


        //        Soru 4 ) double 255.36 sayisini int’a ve
        //        sonra da olusturdugunuz int sayiyi byte’a cevirip yazdirin
        double dblS4 =  255.36;
        int intS4 = (int) dblS4;
        byte bytS4  = (byte) intS4;
        System.out.println(bytS4);


        //        Soru 5 ) int 2 sayiyi birbirine boldurun ve sonucu yazdirin
        int intS5a=34;
        int intS5b=41;
        System.out.println(intS5a/intS5b);


        //        Soru 6 ) int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
        int intS6= 34;
        double dblS6 = 41;
        System.out.println(intS6/dblS6);


        //        Soru 7 ) Farkli data tipleri ile islem yapip, sonuclarini yazdiralim







    }

}
