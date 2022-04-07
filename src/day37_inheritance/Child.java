package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {
    // bir class'i child class yaptigimizda
    // parent class'daki constructor'a ulasmasi gerekir
    // bu durumda parent class'daki constructor'in
    // access modifier'i uygun bir modifier yapilmalidir

    Child(){
        super();
        System.out.println("child class parametreSIZ cons. ");
    }
    Child(int s){
        // Child class'da tum constructor'larin ilk satirina
        // Java'nin yerlestirdigi constructor PARAMETRESIZ dir yani super()

        // super(); // yazmasak da gormesek de eger child class da cons. varsa ilk satirinda super(); vardir
        System.out.println("child class parametreLI cons. ");
    }
    Child(int sayi1, int sayi2){
        // Eger parent class'dan parametresiz constructor'i degil de
        // baska bir constructor'i calistirmak isterseniz
        // bunu Child class'daki constructor'in ILK SATIRINA yazmalisiniz

        super(sayi1,sayi2); // Parent class da iki parametreli cons. calistirmak icin, gorunmeyen super() gitmesin diye super yazip parametre girdik
        System.out.println("iki parametreli cons. ");
    }


    public static void main(String[] args) {
        // Child child=new Child(); // parametreeli cons. denemek icin kapattim
        // Child child=new Child(5); // 2 parametreli cons. denemek icin kapattim
        Child child=new Child(5,8);



    }

}
