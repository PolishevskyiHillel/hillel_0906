package ua.hillel.lessons.lesson3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        System.out.println("Введите число на выбор: 1, 2 или 3");
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        if (digit == 1) {
            System.out.println("Введено число 1");
        } else if (digit == 2) {
            System.out.println("Введено число 2");
        } else if (digit == 3) {
            System.out.println("Введено число 3");
        } else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        }
    }
}