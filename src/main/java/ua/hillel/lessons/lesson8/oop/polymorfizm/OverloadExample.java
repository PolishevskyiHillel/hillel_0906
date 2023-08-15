package ua.hillel.lessons.lesson8.oop.polymorfizm;

public class OverloadExample {
    //Overload
    //Override
    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(3,4));
        System.out.println(add("6", "7"));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a) {
        return a + 6;
    }

    public static String add(String a, String b) {
        return a + b;
    }

    public static String add() {
        return "a" + "b";
    }

}
