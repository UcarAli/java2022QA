package exercises.constructorExercice;

import day34_accessModifier_encapsulation.C01;

public class C02_Student2 {
    public static void main(String[] args) {
        C01_Student1 obj1 = new C01_Student1("Ali CAN");
        C01_Student1 obj2 = new C01_Student1();

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}


