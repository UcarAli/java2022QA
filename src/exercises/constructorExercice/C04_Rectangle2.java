package exercises.constructorExercice;

public class C04_Rectangle2 {
    public static void main(String[] args) {
        C03_Rectangle1 rect = new C03_Rectangle1(4, 5);
        C03_Rectangle1 sq = new C03_Rectangle1(5);

        System.out.println(rect.getArea());
        System.out.println(sq.getArea());
    }
}

