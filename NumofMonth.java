import java.util.Scanner;
public class NumofMonth {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter month number : ");
            int month = in.nextInt();

        switch (month) {
                case 1:
                month = 31; 
                case 3:
                month = 31; 
                case 5:
                month = 31; 
                case 7:
                month = 31; 
                case 8:
                month = 31; 
                case 10: 
                case 12: System.out.println(31); break;
                case 4:
                month = 30; 
                case 6:
                month = 30; 
                case 9:
                month = 30; 
                case 11: System.out.println(30); break;
                case 2:
                month = 28; System.out.println(28); break;
                default:
                System.out.println("Not all 12 months!!!!!"); 
        }
    }  
}
