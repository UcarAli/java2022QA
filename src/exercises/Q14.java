package exercises;


import java.util.Arrays;

public class Q14 {

    public static void main(String[] args) {
        /*  TASK :
         * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]
         *
         * sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

         */
//        String input = "Congratulations";
//        String arr[]=input.split("");
//
//        System.out.println(Arrays.toString(arr));
//
//        String tersArr[] = new String[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[arr.length-1-i].equals("o") ||arr[arr.length-1-i].equals("a") ||arr[arr.length-1-i].equals("u") ){
//                tersArr[i]="i";
//                System.out.print(tersArr[i]);
//            }else {
//                tersArr[i]=arr[arr.length-1-i];
//                System.out.print(tersArr[i]);
//            }
//
//        }
//        System.out.println("");
//        System.out.println(Arrays.toString(tersArr));

        String str = "Congratulations";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr)); // [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]
// Stringin diziye cevrilmis orjinal hali
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals("o") || arr[i].equals("a") || arr[i].equals("u"))
                arr[i] = "i";
            String yeni = arr[i].replaceAll(",", "");
            System.out.print(yeni);
        }
        System.out.println();

    }
}
