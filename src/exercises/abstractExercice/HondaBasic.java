package exercises.abstractExercice;

public class HondaBasic extends Araba implements icAraba, disAraba{
    @Override
    public void move() {

    }

    @Override
    public void kapi() {

    }

    @Override
    public void direksiyon() {
        System.out.println("Direksiyon plastik");
    }

    @Override
    public void koltuk() {
        System.out.println("Koltuk suni deri");
    }

    @Override
    public void klima() {
        System.out.println("Klima manuel");
    }

    @Override
    public void benzin() {
        super.benzin();
    }

    public static void main(String[] args) {

//        HondaBasic.move();
//        HondaBasic.direksiyon();
//        HondaBasic.kapi();
//        HondaBasic.klima();
//        HondaBasic.koltuk();
//        HondaBasic.diesel();

    }
}
