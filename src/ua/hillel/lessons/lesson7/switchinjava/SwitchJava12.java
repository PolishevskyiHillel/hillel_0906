package ua.hillel.lessons.lesson7.switchinjava;

public class SwitchJava12 {

    public static void main(String[] args) {

        int count = 2;
        int value;
        switch (count) {
            case 1:
                value = 32;
                break;
            case 2:
                value = 44;
                break;
            case 3:
                value = 78;
                break;
            default:
                value = 0;
        }
    }

    public static void modiffSwitch2() {
        int count = 2;
        int value = switch (count) {
            case 1, 3, 5 -> 32;
            case 2, 7, 8 -> 44;
            case 22, 33, 55 -> 78;
            default -> 0;
        };
    }

    public static void modiffSwitch() {
        int count = 2;
        int value = switch (count) {
            case 1 -> 32;
            case 2 -> 44;
            case 3 -> 78;
            default -> 0;
        };
    }
}
