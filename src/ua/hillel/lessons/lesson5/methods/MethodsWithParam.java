package ua.hillel.lessons.lesson5.methods;

public class MethodsWithParam {
    public static void main(String[] args) {
        sum(5, 10);
        sayName("Kolia");
        sayName("Alex");
        sayNameAndAge("Alex", 35);
    }

    public static void sayNameAndAge(String name, int age) {
        if (age == 33) {
            System.out.println(name + " " + age);
        } else {
            System.out.println("Не знаю такого возраста");
        }
    }

    public static void sayName(String name) {
        System.out.println(name);
    }

    public static void sum(int number1, int number2) {
        int result = number1 + number2;
        System.out.println(result);
    }
}
