import java.util.Scanner;

public class DisplayTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[12];
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i < 12; i++) {
            System.out.print("Please enter temp of " + months[i] + ": ");
            A[i] = input.nextInt();
        }

        int maxTemp = A[0];
        int minTemp = A[0];
        int maxMonth = 0;
        int minMonth = 0;

        for (int i = 0; i < 12; i++) {
            if (A[i] > maxTemp) {
                maxTemp = A[i];
                maxMonth = i;
            }
            if (A[i] < minTemp) {
                minTemp = A[i];
                minMonth = i;
            }
        }

        System.out.println("Maximum temp is " + maxTemp + " and " + maxTemp + " is a temp of " + months[maxMonth] + ",");
        System.out.println("Minimum temp is " + minTemp + " and " + minTemp + " is a temp of " + months[minMonth] + ",");
    }
}

