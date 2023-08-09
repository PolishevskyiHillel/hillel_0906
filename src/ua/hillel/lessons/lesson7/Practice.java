package ua.hillel.lessons.lesson7;

import java.util.Random;

//    Написать програмну, в которой создаётся целочисленный массив из 8 случайных чисел
//    из дизпозона [0, 100] и выводит максимальный элемент массива в консоль.

public class Practice {
    public static void main(String[] args) {

        int max =0;
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Max element = " + max);
    }
}
