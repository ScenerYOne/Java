import java.util.Scanner;
public class NumberGuess {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int number,i=0 ;
        int secretNumber;
    
    do{
        System.out.print("Key in you guess number : ");
        number = in.nextInt();
        secretNumber = 50;
        if(number > secretNumber){
            System.out.println("Try lower");
        }else if(number < secretNumber){
            System.out.println("Try higher");
        }else if(number == secretNumber){
            System.out.println("Congratulation");    
    } 
    i++;
    
    }while(number!=secretNumber);
    System.out.println(i);
}
}