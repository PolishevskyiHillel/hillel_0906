package ua.hillel.lessons.lesson3;

import static java.lang.Math.max;
import static java.lang.Math.sqrt;

public class Lesson3 {
    public static void main(String[] args) {
        int a = 8;
        System.out.println(sqrt(a));

        int b = 10;
        int h = 15;
        System.out.println(max(b, h));
    }

    public static void sayHelloAndName() {
        System.out.print("hello ");
        System.out.println("Alex");
    }
}