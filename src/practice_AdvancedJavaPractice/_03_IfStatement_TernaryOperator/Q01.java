package practice_AdvancedJavaPractice._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yapmak istediginiz islemi belirtmek icin konsola \ntoplama için 1 \nçikarma için 2\nbolme için 3\nçarpma için 4 giriniz.");
		int islem = scan.nextInt();

		System.out.println("Lutfen iki tam sayi giriniz.");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();

		if (islem==1) {
			System.out.println("Toplama isleminin sonucu : " + num1 + " + " + num2 + " = " + (num1 + num2));
		} else if (islem==2) {
			System.out.println("Cikarma isleminin sonucu : " + num1 + " - " + num2 + " = " + (num1 - num2));
		} else if (islem==3) {
			System.out.println("Bolme isleminin sonucu : " + num1 + " / " + num2 + " = " + (num1 / num2));
		} else if (islem==4) {
			System.out.println("Carpma isleminin sonucu : " + num1 + " x " + num2 + " = " + (num1 * num2));
		} else {
			System.out.println("Hatali bir giris yaptiniz. Lutfen yapmak istediginiz isleme uygun bir sayi giriniz.");
		}




	}

}
