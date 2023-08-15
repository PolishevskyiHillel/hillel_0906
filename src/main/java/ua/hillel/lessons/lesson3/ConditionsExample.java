package ua.hillel.lessons.lesson3;

public class ConditionsExample {
    public static void main(String[] args) {
        method2();
    }

    public static void method2() {
        int a = 7;
        int b = 6;

        if (a == b) {
            System.out.println("digits the same");
        } else if (a > 6) {
            System.out.println("a rather than b");
        } else {
            System.out.println("a less b");
        }
    }

    public static void method1() {
        int a = 6;
        int b = 7;

        if (a == b) {
            System.out.println("digits the same");
        } else {
            System.out.println("digits are not same");
        }
    }
}
