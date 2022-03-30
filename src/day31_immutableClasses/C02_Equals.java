package day31_immutableClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C02_Equals {
    public static void main(String[] args) {
        String a="";
        a +=2;
        a +='c';
        a +=false;

        if (a=="2cfalse"){
            System.out.println("a if1 ==");}
        if (a.equals("2cfalse")) {
            System.out.println("a if1 equalas");
        }

        String b = "2cfalse";

        if (b=="2cfalse"){
            System.out.println("b if2 ==");}
        if (b.equals("2cfalse")) {
            System.out.println("b if2 equalas");
        }

        LocalDate c=LocalDate.now();
        LocalTime d=LocalTime.now();
        LocalDateTime e=LocalDateTime.now();
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}
