import java.util.Scanner;
public class EqualNumber {
    public static void main (String [] args){
    Scanner in = new Scanner(System.in);
        System.out.print("No.1 : ");
            int number1 = in.nextInt();
        System.out.print("No.2 : ");
            int number2 = in.nextInt();
        System.out.print("No.3 : ");
            int number3 = in.nextInt();
   if(number1 == number2 && number2 == number3){
        System.out.print("Equal");
   }     
    else 
        System.out.print("Not Equal");    
    }   
}
