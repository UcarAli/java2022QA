package practice_AdvancedJavaPractice._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu cm giriniz."); // kullaniciya kolay olsun diye boyu cm girmesini istedik.
        double boy = scan.nextDouble();

        System.out.println("Lutfen kilonuzu kg giriniz.");
        double kilo = scan.nextDouble();

        double bmi = kilo / ((boy/100) * (boy/100)); // Kullanicidan boyu cm girmesini istedigimizden, cm yi m cevirmek icin 100 bolduk.

        if (bmi<=20) {
            System.out.println("Oldukca zayifsiniz.");
        } else if (bmi<=25) {
            System.out.println("Normal sinirlardasiniz.");
        } else if (bmi<=30) {
            System.out.println("Sisman kategorisindesiniz.");
        } else {
            System.out.println("Obez grubundasiniz.");
        }







    }

}
