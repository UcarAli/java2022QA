package practice_AdvancedJavaPractice._09_Arrays;

public class Q05 {

    public static void main(String[] args) {
        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük ve esit olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4 5 6 7
         */

        int arr[]={1,2,3,4,5,6,7};
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];
        }
        double ortalama=toplam/arr.length;
        System.out.println(ortalama);
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>=ortalama) {
                System.out.print(arr[i]+" ");
            }
        }
//        int toplm=0;
//        for (int each:arr
//        ) {
//            toplm+=each;
//        }
//        System.out.println(toplm);
//        double ort=toplam/arr.length;
//        for (int each:arr
//        ) {
//            if (each>ort){
//                System.out.print(each+ " ");
//            }
//        }
    }
}
