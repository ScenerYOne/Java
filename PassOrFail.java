import java.util.Scanner;
public class PassOrFail {
    public static void main(String [] agrs) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter score1: ");
        int score1 = in.nextInt();
        System.out.print("Enter score2: ");
        int score2 = in.nextInt();
        System.out.print("Enter score3: ");
        int score3 = in.nextInt();
            if (score1 < 50 || score2 <50 || score3 < 50){
            System.out.print("Fail");
            }else{
            float mean = (score1 +score2 + score3 )/3;
            System.out.println("mean"+mean);
            if ( mean >= 85){
                System.out.println("Grade A");
            }
            else if ( mean >= 65){
                System.out.println("Grade B");
            }
            else {
                System.out.println("Grade C");
            }
        }
    }
        }


