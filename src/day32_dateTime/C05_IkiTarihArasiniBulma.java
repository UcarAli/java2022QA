package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {

        LocalDate bugun =LocalDate.now();
        LocalDate dogumGunu =LocalDate.of(1987,12,2);

        System.out.println(Period.between(dogumGunu,bugun)); // P34Y3M29D
        System.out.println(Period.between(dogumGunu,bugun).getYears()); // 34

        // FIXME: 31.03.2022


    }
}
