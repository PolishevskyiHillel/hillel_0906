package ua.hillel.lessons.lesson6;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        myMethod();
    }

//    Написать программу, которая будет выполнять следующие действия:
//            1.
//    Ввести в консоль "Привет, меня зовут Макс."
//            2. Посчитать и вывести в консоль количество слов из строки введенной ранее.
//    СагАТ возвращает символ, стоящий на определенном индексе

    public static void myMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String str = scanner.nextLine();
        int count = 0;
        if (str.length() != 0) {
            count++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            System.out.println("Ви ввели " + count + " слів");
        }
    }
}

