package day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {
        Map<String,Integer> myMap = new HashMap<>();
        myMap.put("H",3);
        myMap.putIfAbsent("K",5);
        System.out.println(myMap);

        // bir ekleme yapmak istedigimizde Key daha once eklenmemisse map'e eklsen
        // daha onceden eklenmisse , eskiyi silmemek icin bizi uyarsin

        System.out.println(myMap.putIfAbsent("A", 6));
        System.out.println(myMap.putIfAbsent("K", 20));
        System.out.println(myMap);

        if (myMap.putIfAbsent("K", 7) !=null){
            System.out.println("Girdiginiz Key Map'de zaten var.");
        }
        System.out.println(myMap);

        myMap.put("A",10);
        System.out.println(myMap);

        myMap.computeIfAbsent("A",v->20);
        System.out.println(myMap);

        myMap.compute("A",(key,value)->20);
        System.out.println(myMap);

        // H'nin  value'sunu 2 katinin 5 eksigi yapalim
        myMap.compute("H",(key,value) ->(2*value+5));
//        myMap.compute("H",(k,v) ->(2*v+5)); // boylede olur
//        myMap.compute("H",(m,n) ->(2*n+5)); // boylede olur
        System.out.println(myMap);


    }
}
