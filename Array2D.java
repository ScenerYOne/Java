import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        int tmp, x, y;

        int[] sum = {0, 0};
        int[][] emp = new int[2][3];

        Scanner input = new Scanner(System.in);

        // Input number of employee
        for (x = 0; x < emp.length; x++) {
            for (y = 0; y < emp[0].length; y++) {
                System.out.println("Enter no. of employee in Building " + (x + 1) + " , floor " + (y + 1) + ": ");
                emp[x][y] = input.nextInt();
            }
        }

        // Compute no. of employee in each building
        for (x = 0; x < emp.length; x++) {
            tmp = 0;
            for (y = 0; y < emp[0].length; y++) {
                tmp += emp[x][y];
            }
            sum[x] = tmp;
        }

        // Compute no. of employee in floor 3 of building 1 & 2
        int sumf3 = 0;
        for (x = 0; x < emp.length; x++) {
            sumf3 += emp[x][2];
        }

        // Compute Total Number of employee
        int total = 0;
        for (x = 0; x < emp.length; x++) {
            for (y = 0; y < emp[0].length; y++) {
                total += emp[x][y];
            }
        }

        // Display result
        for (x = 0; x < emp.length; x++) {
            System.out.println("Number of employee in Building " + (x + 1) + " : " + sum[x]);
        }
        System.out.println("Number of employee in floor 3 of Building 1 & 2 : " + sumf3);
        System.out.println("Total Number of employee : " + total);
    }
}