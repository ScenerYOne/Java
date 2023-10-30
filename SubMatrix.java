import java.util.Scanner;

public class SubMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[][] aArray = {
            {1, 2},
            {3, 4}
        };

        int[][] bArray = {
            {1, 2},
            {3, 4}
        };

        int[][] result = subMatrix(aArray, bArray);

        System.out.println("Matrix A:");
        printMatrix(aArray);

        System.out.println("Matrix B:");
        printMatrix(bArray);

        System.out.println("Matrix A - B:");
        printMatrix(result);
    }

    public static int[][] subMatrix(int[][] aArray, int[][] bArray) {
        int rows = aArray.length;
        int cols = aArray[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = aArray[i][j] - bArray[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] nArray) {
        int rows = nArray.length;
        int cols = nArray[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(nArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
