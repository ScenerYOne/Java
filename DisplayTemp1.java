import java.util.Scanner;

public class DisplayTemp1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] month = {6, 12, 18, 60, 30, 36, 42, 48, 56, 24, 17, 20};
        String[] dd = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int max = month[0];
        int min = month[0];
        int[] cmax = new int[12];
        int[] cmin = new int[12];

        for (int i = 0; i < 12; i++) {
            if (month[i] > max) {
                max = month[i];
            } else if (month[i] < min) {
                min = month[i];
            }
            System.out.print("Please enter temp of " + dd[i] + ": ");
        }
            
        for (int i = 0; i < 12; i++) {
            System.out.println("Maximum temp for " + dd[i] + " is " + cmax[i]);
            System.out.println("Minimum temp for " + dd[i] + " is " + cmin[i]);
        }
    }
}
