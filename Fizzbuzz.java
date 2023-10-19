import java.util.Scanner;
public class Fizzbuzz {
    public static void main(String [] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n =in.nextInt();      
       
        if (n%5==0 && n%3 == 0){
        System.out.println("Fizzbuzz");
        
        }
        else if (n%3 == 0)
            System.out.println("Fizz");
    
        else if (n%5 == 0)
            System.out.println("Buzz");

   
    
    }
}             


    


