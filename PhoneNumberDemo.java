import java.util.Scanner;
public class PhoneNumberDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter phone number 1: ");
        String phoneNumber1 = in.nextLine();
        PhoneNumber phone1 = new PhoneNumber(phoneNumber1);

        System.out.print("Enter phone number 2: ");
        String phoneNumber2 = in.nextLine();
        PhoneNumber phone2 = new PhoneNumber(phoneNumber2);

        System.out.println("We have 2 Phone Numbers");
        System.out.println("Phone number 1 is " + phone1);
        printDigitSummary(phone1);

        System.out.println("Phone number 2 is " + phone2);
        printDigitSummary(phone2);

        in.close();
    }

    private static void printDigitSummary(PhoneNumber phoneNumber) {
        int[] digitFreq = phoneNumber.calFreq();

        System.out.println("Digit Summary");
        for (int i = 0; i < digitFreq.length; i++) {
            if (digitFreq[i] > 0) {
            System.out.println(i + " " + printAsterisks(digitFreq[i]));
        }
    }
    }

    private static String printAsterisks(int count) {
        StringBuilder asterisks = new StringBuilder();
        for (int i = 0; i < count; i++) {
            asterisks.append("*");
        }
        return asterisks.toString();
    }
}