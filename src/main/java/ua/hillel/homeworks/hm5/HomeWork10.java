package ua.hillel.homeworks.hm5;

public class HomeWork10 {
    public static void main(String[] args) {
        System.out.println(smallerNumber(7, 3));
    }

    public static int smallerNumber(int number1, int number2) {
        if (number1 > number2) {
            return number2;
        } else {
            return number1;
        }
    }
}