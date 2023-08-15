package ua.hillel.homeworks.hm6;

public class HomeWork13 {
    public static void main(String[] args) {
        lessonsExample();
    }

    public static void lessonsExample() {
        int allLessons = 3;
        for (int l = 1; l <= allLessons; l++) {
            System.out.println("Это " + l + "-й урок!");
            if (l != 3) {
                System.out.println("    Я выполнил все домашние задания " + l + "-го урока.");
            } else {
                System.out.println("    Я не выполнил домашние задания " + l + "-го урока.");
            }
        }
    }
}