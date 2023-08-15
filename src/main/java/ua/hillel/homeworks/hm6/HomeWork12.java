package ua.hillel.homeworks.hm6;

public class HomeWork12 {
    public static void main(String[] args) {
        pyramidExample();
    }

    public static void pyramidExample() {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < rows - i - 1; k++) {
                System.out.print(" ");
            }
            for (int p = 0; p <= i; p++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
