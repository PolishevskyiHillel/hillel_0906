package ua.hillel.homeworks.hm8;

public class HomeWork15 {
    public static void main(String[] args) {
        arithmeticMean();
    }

    public static void arithmeticMean() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = generateRandomDigit(10, 20);
        }

        System.out.println("Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;

        System.out.println("Average: " + average);
    }

    public static int generateRandomDigit(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}