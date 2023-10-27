import java.util.Scanner;

public class FindAboveMean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter n: ");
            int n = input.nextInt();
            int[] numbers = new int[n];

            System.out.print("Enter " + n + " numbers: ");
            for (int i = 0; i < n; i++) {
                numbers[i] = input.nextInt();
            }

            double mean = calculateMean(numbers);
            System.out.println("Mean: " + mean);

            int countAboveMean = 0; // Initialize a counter for elements above the mean

            System.out.println("Elements above mean: ");
            for (int number : numbers) {
                if (number > mean) {
                    System.out.print(number + " ");
                    countAboveMean++; // Increment the counter
                }
            }
            System.out.println("Summary : " + countAboveMean); // Display the count

            System.out.print("Do you want to continue (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
        System.out.println("Bye Bye !!!");
    }

    public static double calculateMean(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
}
