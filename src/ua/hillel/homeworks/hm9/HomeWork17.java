package ua.hillel.homeworks.hm9;

public class HomeWork17 {
    public static void main(String[] args) {
        Object[] array = new Object[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Integer) {
                int value = (Integer) array[i];
                if (value % 2 == 0) {
                    array[i] = 'Y';
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}