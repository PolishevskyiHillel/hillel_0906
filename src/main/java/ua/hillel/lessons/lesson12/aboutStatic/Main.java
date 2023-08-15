package ua.hillel.lessons.lesson12.aboutStatic;

public class Main {

    public static void main(String[] args) {
        System.out.println(Cat.name);
    }

    public static void sayHello() {
        System.out.println("Hello world");
    }

    public void sayAge() {
        sayHello();
    }
}
