package day02_variables;

public class C02_Variables {
    public static void main(String[] args) {

        String okulIsmi;
        okulIsmi="Yildiz Koleji";
        System.out.println(okulIsmi);

        okulIsmi="Star College";
        System.out.println(okulIsmi);

        // println ile print arasindaki fark
        // println dediginizde yazdirma isleminden sonra alt satira gecerken
        // sadece print dedigimizde yazdirma isleminden sonra alt satira gecmez

        System.out.print(okulIsmi); //Star College
        System.out.print(okulIsmi);
    }
}
