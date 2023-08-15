package ua.hillel.lessons.lesson11.superwithconstructor;

public class B extends A{

    public B() {
        System.out.println("B - Метод построения без параметров");
    }

    public B(int value) {
        super(199);
        System.out.println("Метод построения B с параметром " + value);
    }
}
