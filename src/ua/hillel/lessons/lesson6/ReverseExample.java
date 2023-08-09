package ua.hillel.lessons.lesson6;

public class ReverseExample {
    public static void main(String[] args) {
        reverseExmpl();
    }

    public static void reverseExmpl() {

        String[] str = {"Привіт", "мене", "звуть", "Макс"};
        //n-i-1
        int n = str.length;
        String temp;

        for (int i = 0; i < n / 2; i++) {
            temp = str[n - i - 1];
            str[n - i - 1] = str[i];
            str[i] = temp;
        }

        for (String i : str) {
            System.out.print(i + " ");
        }
    }
}
