package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        // Verilen bir array'e yeni bir element ekleyen bir method olusturun

        int arr[]= {3,5,7};
        int eklenecekElement=4;

        arr=arrayeElementEkle(arr, eklenecekElement);
        arr=arrayeElementEkle(arr, 11);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] arrayeElementEkle(int[] arr, int eklenecekElement) {
        int yeniArray[]= new int[arr.length+1]; // [0,0,0,0]
        for (int i = 0; i <arr.length ; i++) {
            yeniArray[i] = arr[i];

        }
        yeniArray[yeniArray.length-1]=eklenecekElement;

        return yeniArray;

    }
}
