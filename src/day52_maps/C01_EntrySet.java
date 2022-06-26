package day52_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_EntrySet {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap = MapOlustur.myMap();
        System.out.println(sinifListMap);

//        System.out.println(sinifListMap.entrySet());
        /*
            herhangiBirMap.entrySet(); meyhod'u bize Entry'lerden olusan bir set dondurur
            Eger bu Entry'leri manipule etmek istiyorsak
            method'un dondurdugu Set'i yeni bir Set olusturup store etmeliyiz
         */

        Set<Map.Entry<Integer,String>> sinifEntrySeti = sinifListMap.entrySet();

        System.out.printf("|%-30.58s|\n"," -------------------------------------------------------------------");
        System.out.printf("| %-4S | %-10S | %-10S | %-10S | %-10S |\n","No", "Isim", "Soyisim", "Brans", "D.Yili");
        System.out.printf("|%-30.58s|\n"," -------------------------------------------------------------------");
        for (Map.Entry<Integer,String> each: sinifEntrySeti
             ) {
//            System.out.println(each);
            Integer entryKey = each.getKey();
            String entryValue = each.getValue();
            String valueArr[] = entryValue.toString().split(", ");

            System.out.printf("| %-4s | %-10s | %-10s | %-10s | %-10s |\n",entryKey,valueArr[0],valueArr[1],valueArr[2],valueArr[3]);

        }
        System.out.printf("|%-30.58s|\n"," -------------------------------------------------------------------");

    }
}
