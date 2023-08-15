package ua.hillel.homeworks.hm7;

import java.util.Scanner;

public class HomeWork14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = getInt(scanner);
        int num2 = getInt(scanner);
        char operation = getOperation(scanner);
        int result = calc(num1, num2, operation);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static int getInt(Scanner scanner) {
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }

    public static char getOperation(Scanner scanner) {
        System.out.print("Enter an operation (+, -, * or /): ");
        return scanner.next().charAt(0);
    }

    public static int calc(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> System.out.println("Error: Invalid operation");
        }
        return result;
    }
}