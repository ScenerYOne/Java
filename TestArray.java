import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        double sum, average;
        int n,i;
        Scanner input = new Scanner(System.in);
        do {
        System.out.print("How many elements of array (allow: 1 to 10)?: ");
        n = input.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("Input error!. Try again between 1 to 10.");
           
        }
    } while (n<1||n > 10);
        sum=0;
        int[]cArray = new int[n];

         for (i = 0; i < cArray.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
           cArray[i] = input.nextInt();
           sum += cArray[i];
        }
            average = sum/cArray.length;
            System.out.print("The average of ");
            for (i = 0; i < cArray.length; i++) {
                System.out.print(i +"\t ");
            }
        System.out.println(" is " + average);
        System.out.println("Bye Bye.");
    }
}
