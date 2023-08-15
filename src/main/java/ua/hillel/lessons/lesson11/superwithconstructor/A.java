package ua.hillel.lessons.lesson11.superwithconstructor;

public class A {
    public A() {
        System.out.println("A - Метод построения без параметров");
    }

    public A(int value) {
        System.out.println("Метод построения А с параметром " + value);
    }
}
