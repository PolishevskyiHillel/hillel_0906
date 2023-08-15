package ua.hillel.lessons.lesson7.randomizer;

public class RandomExample {
    public static void main(String[] args) {
//        (Math.random() * (b-a) ) + a
//        [0,3)
//        (Math.random() * (3-0)) + 0

        double a = Math.random() * 3;
        System.out.println(a);

//        [2,3)
//        (Math.random() * (3-2)) + 2 => (Math.random() * 1) + 2
//        => Math.random() + 2

        double b = Math.random() + 2;
        System.out.println(b);

//        [0,2]
        int c = (int) (Math.random() * 3);
        System.out.println(c);
    }
}
