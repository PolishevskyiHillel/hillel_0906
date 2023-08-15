package ua.hillel.homeworks.hm4;

public class HomeWork8 {
    public static void main(String[] args) {
        whileExample();
    }

    public static void whileExample() {
        int i = 1;
        while (i <= 512) {
            System.out.print(i + " ");
            i = i + i;
        }
    }
}
