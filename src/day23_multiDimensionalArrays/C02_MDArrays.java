package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {
    public static void main(String[] args) {
        // Verilen multi dimentional array'in tum elementlerinin toplamini bulunuz
        int arr[][]={{3,1,7},{6,10,2}};
        // System.out.println("arr[1][2] = " + arr[1][2]);

        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam+= arr[i][j];
            }
        }
        System.out.println("array tum elementler toplami : "+toplam);

    }
}
