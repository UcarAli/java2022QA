package exercises.constructorExercice;

public class C01_Student1 {
    /**
     * Write a program to print the names of students by creating a Student class.
     * If no name is passed while creating an object of Student class,
     * then the name should be "Unknown", otherwise the name
     * should be equal to the String value passed while creating
     * object of Student class.
     *
     * Student class oluşturarak öğrencilerin isimlerini yazdıran
     * bir program yazın. Student class bir nesnesi oluşturulurken
     * herhangi bir isim iletilmezse, isim "Unknown" olmalıdır,
     * aksi takdirde isim, Student class nesnesi oluşturulurken
     * geçirilen String değerine eşit olmalıdır.
     */

    String name;

    public C01_Student1 (String name){
        this.name = name;
    }
    public C01_Student1(){
        name = "Unknown";
    }

}
