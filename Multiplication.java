import java.util.Scanner;
public class Multiplication {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
            char choice;
            int number;
        do{

            do{
                System.out.print("Number [2 to 12] : ");
                number = in.nextInt();
                    if( number < 2 || number > 12){
                         System.out.println("Invalid");
                    }
            } while(number < 2 || number >12);

            for(int i = 1; i<=12; i++){
                System.out.println(number + " x " + i +" = " +(number * i));
            }

             System.out.print("Do you want to continue [y/n] : ");
                  choice = in.next().charAt(0);

    } while (choice == 'y' || choice =='Y' );
        System.out.println("Bye Bye !!!!");   

    } 
}