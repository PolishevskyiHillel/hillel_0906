package ua.hillel.lessons.lesson5.twodimarray;

public class DimArrayExample {
    public static void main(String[] args) {
        emptyDimArray();
    }

    public static void emptyDimArray() {
        int[][] twoDimArray = {{5, 7, 3, 17},
                {7, 0},
                {8, 1, 2}};

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int k = 0; k < twoDimArray[i].length; k++) {
                System.out.print(" " + twoDimArray[i][k] + " ");
            }
        }


        int[][] twoDimArray2 = new int[3][4];
        twoDimArray2[0][0] = 5;
        twoDimArray2[0][1] = 7;
        twoDimArray2[0][2] = 3;
        twoDimArray2[0][3] = 17;
        twoDimArray2[1][0] = 7;
        twoDimArray2[1][1] = 0;
        twoDimArray2[1][2] = 1;
        twoDimArray2[1][3] = 12;
        twoDimArray2[2][0] = 8;
        twoDimArray2[2][1] = 1;
        twoDimArray2[2][2] = 2;
        twoDimArray2[2][3] = 3;
    }
}
