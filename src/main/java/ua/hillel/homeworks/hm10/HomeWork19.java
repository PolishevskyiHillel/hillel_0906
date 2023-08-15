package ua.hillel.homeworks.hm10;

public class HomeWork19 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int newDigit = 7;
        int[] newResult = addNewDigit(a, newDigit);
        for (int result : newResult) {
            System.out.print(result + " ");
        }
    }

    public static int[] addNewDigit(int[] arr, int number) {
        int length = arr.length;
        int[] newArray = new int[length + 1];
        for (int i = 0; i < length; i++) {
            newArray[i] = arr[i];
        }
        newArray[length] = number;
        return newArray;
    }
}