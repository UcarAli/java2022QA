//package exercises.depoProjeGokanAgar;
//
//import static _14_Encapsulation.Q02.UserMain.scanner;
//
//public class TryCatch {
//
//    public static int intGirisi() {
//        int giris = 0;
//        boolean flag = true;
//        boolean flag2 = false;
//        do {
//            giris = 0;
//            try {
//                if (flag2 == true) { scanner.nextLine(); }
//
//                flag2 = true;
//                giris = scanner.nextInt();
//                scanner.nextLine();
//                flag = false;
//                flag2 = false;
//            } catch (Exception e) {
//                System.out.println("lütfen geçerli bir giris yapınız");
//            }
//        } while (flag);
//
//        return giris;
//    }
//    public static String stringGirisi() {
//        String giris = "";
//        boolean flag = true;
//
//        do {
//            giris = "";
//            try {
//                giris = scanner.next();
//                scanner.nextLine();
//                flag = false;
//            } catch (Exception e) {
//                System.out.println("lütfen geçerli bir giris yapınız");
//            }
//        } while (flag);
//        return giris;
//    }
//
//}
