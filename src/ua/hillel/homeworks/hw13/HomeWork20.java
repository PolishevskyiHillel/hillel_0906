package ua.hillel.homeworks.hw13;

public class HomeWork20 {
    public static void main(String[] args) {
        int startCounting = 1;
        int endCounting = 10;
        happyNumber(startCounting, endCounting);
    }

    public static void happyNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i == 3) {
                System.out.println("Вот счастливое число!");
                break;
            }
        }
    }
}