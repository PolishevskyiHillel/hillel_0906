package ua.hillel.lessons.lesson3;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        method4();
    }

    public static void method4() {
        System.out.println("Enter any phrase");
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.next();
        System.out.println("You enter phrase: " + phrase);
    }

    public static void method3() {
        System.out.println("Enter any phrase");
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
        System.out.println("You enter phrase: " + phrase);
    }

    public static void method2() {
        System.out.println("Enter any digit");
        Scanner scanner = new Scanner(System.in);
        int numberIn1 = scanner.nextInt();
        int numberIn2 = scanner.nextInt();
        int result = numberIn1 + numberIn2;
        System.out.println(result);
    }

    public static void method1() {
        System.out.println("Enter any digit from 1 to 10");
        Scanner scanner = new Scanner(System.in);
        int numberInt = scanner.nextInt();
        int result = numberInt + 100;
        System.out.println("You enter " + numberInt);
        System.out.println("Result " + result);
    }

}
