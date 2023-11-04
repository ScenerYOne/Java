import java.util.Scanner;
public class Fizzbuzzx {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        if(n%5==0 && n%3==0){
            System.out.println("FizzBuzz:");

        } 
        else if(n%5==0)
            System.out.println("Buzzx:");
         
        else if(n%3==0)
            System.out.println("Fizzx");
            else
                System.err.println("not");

        } 

    }

