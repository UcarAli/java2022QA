package day10_Switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {

        // Concatenation yapmak icin iki ihtimalimiz var
        // istersek daha once yaptigimiz gibi + operatorunu kullanabiliriz
        // veya String class'indan gelen concat method'unu kullanabiliriz

        String str1 = "Java";
        String str2 = "Candir";

        // Jaava Candir yazdiralim
        System.out.println(str1+" "+str2);

        String cumle = str1.concat(str2); //JavaCandir
        System.out.println(cumle);

        cumle = str1.concat(" ").concat(str2);
        System.out.println(cumle);

        // concat icine String degil de sayi veya boolean yazsak ?
        // concat method'u icine String parametre ister
        // String disinda bir data turu yazdiginizda onu String haline getirmelisiniz

        cumle=str1.concat(""+5);
        System.out.println(cumle);
        cumle=str1.concat(true+"");
        System.out.println(cumle);


    }
}