import java.util.Scanner;
public class Ofnum {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of seconds : ");
        int seconds = sc.nextInt();
        int hours,minute;
        hours = seconds/3600 ;
        seconds = seconds % 3600;
        minute = seconds/60;
       seconds = seconds % 60;
        System.out.println("1000 seconds is apprpximately "+hours+"hours"+minute+"minute and"+seconds+"seconds");
        
    }
}
