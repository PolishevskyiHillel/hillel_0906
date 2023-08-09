package ua.hillel.homeworks.hm3;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        System.out.println("Enter two integers one by one");
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();
        System.out.println("Enter a name");
        String name = scanner.next();
        int result = firstInt + secondInt;
        System.out.println(name + " " + result);
    }
}
