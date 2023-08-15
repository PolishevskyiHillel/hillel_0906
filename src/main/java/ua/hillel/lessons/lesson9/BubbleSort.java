package ua.hillel.lessons.lesson9;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {11, 3, 14, 16, 7}; // 1. 3 11 14 16 7
                                        // 4. 3 11 14 7 16
                                        // 2.3 3 11 7 14 16
                                        // 3.2 3 7 11 14 16
                                        // 4 while

        boolean isSorted = false;
        int temp;
        while (!isSorted) { //(true)
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) { //1. 11 > 3 //2. 11 > 14 //3. 14 > 16 //4. 16 > 7
                    isSorted = false;
                    temp = array[i]; //1. temp = 11 //4. temp = 16
                    array[i] = array[i + 1]; //1. 11 = 3 //4. 16 = 7
                    array[i + 1] = temp; //1. 3 = 11 //4. 7 = 16
                }
            }
        }

        for (int arr : array) {
            System.out.println(arr + " ");
        }
    }
}
