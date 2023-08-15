package ua.hillel.lessons.lesson4.switchpack;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        switchConditionStr();
    }

    public static void switchConditionStr(){
        System.out.println("Введите число на выбор: 1, 2 или 3");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();

        switch (month) {
            case "Январь":
                System.out.println("Введено Январь");
                break;
            case "Март":
                System.out.println("Введено Март");
                break;
            case "Июль":
                System.out.println("Введено Июль");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }

    public static void switchCondition() {
        System.out.println("Введите число на выбор: 1, 2 или 3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Введено число 1");
                break;
            case 2:
                System.out.println("Введено число 2");
                break;
            case 3:
                System.out.println("Введено число 3");
                break;
            default:
                System.out.println("Вы ввели число не равное 1, 2 или 3");
        }
    }

    public static void condition() {
        System.out.println("Введите число на выбор: 1, 2 или 3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Введено число 1");
        } else if (number == 2) {
            System.out.println("Введено число 2");
        } else if (number == 3) {
            System.out.println("Введено число 3");
        } else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        }
    }
}
