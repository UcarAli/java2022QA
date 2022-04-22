package exercises.constructorExercice;

public class C05_Car {
    /**
     * Aşağıda verilen C05_Car class da, brand variable ni class bady de “Ford” string'iyle
     * başlatan bir constructor yazın.
     * C06_Car2'inda main method da getBrand() methodunu çağırın ve
     * brand variable değerini bir değişkende saklayın ve değeri yazdırın.
     */
    static String brand;
    int a;

    //your constructor here
    public C05_Car(String brand,int a){}

    public C05_Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    void run() {
        System.out.println("Car is running...");
    }
}
