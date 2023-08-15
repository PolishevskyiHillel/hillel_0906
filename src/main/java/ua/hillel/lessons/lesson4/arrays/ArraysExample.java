package ua.hillel.lessons.lesson4.arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5};
        String[] arrayStr = {"Alex", "Igor", "Kostya"};
        int arrayLength = array.length;
        System.out.println(arrayLength);

        int arrayLengthStr = arrayStr.length;
        System.out.println(arrayLengthStr);

        System.out.println(arrayStr[1]);

        System.out.println(array[2]);

        int[] array1 = new int[3];
        array1[0] = 10;
        array1[1] = 150;
        array1[2] = 200;

        System.out.println(array1[0]);

        boolean[] array2 = new boolean[3];
        System.out.println(array2[1]);
    }
}
