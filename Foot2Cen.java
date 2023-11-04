import java.util.Scanner;
public class Foot2Cen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int feet,inch;

        System.out.print("Enter feet and inch: ");
        feet = in.nextInt();
        inch = in.nextInt();
        System.out.println("You are " +feet+" feet , "+inch+" inches tall ");
        System.out.println("Total inches: " +((feet*12)+inch));
        System.out.println("Total centimter: " +(((feet*12)+inch)*2.54));

    }
}
