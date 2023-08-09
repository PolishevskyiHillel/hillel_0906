package ua.hillel.lessons.lesson7.switchinjava;

public class SwitchJava13 {

    public static void main(String[] args) {

        int count = 2;
        int value = switch (count) {
            case 1:
                yield 32;
            case 2:
                yield 44;
            case 3:
                yield 78;
            default:
                yield 0;
        };
    }
}
