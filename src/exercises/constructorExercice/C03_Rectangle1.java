package exercises.constructorExercice;

public class C03_Rectangle1 {
    private int length;
    private int breadth;

    public C03_Rectangle1 (int side) {
        length = side;
        breadth = side;
    }

    public C03_Rectangle1(int l, int b) {
        length = l;
        breadth = b;
    }

    public int getArea() {
        return length * breadth;
    }
}

