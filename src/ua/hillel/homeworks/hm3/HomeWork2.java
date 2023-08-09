package ua.hillel.homeworks.hm3;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        System.out.println("Введите число 1");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        if (numberOne == 1) {
            System.out.println("Вы ввели число 1");
        } else {
            System.out.println("Вы ввели число не равное 1");
        }
    }
}
