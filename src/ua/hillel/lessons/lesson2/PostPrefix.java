package ua.hillel.lessons.lesson2;

public class PostPrefix {
    public static void main(String[] args) {
        int n = 2;
        int a = 2 * n++;
        System.out.println(a);
        System.out.println(n);

        int k = 2;
        int b = 2 * ++k;
        System.out.println(b);
    }
}
