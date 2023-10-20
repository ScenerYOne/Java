import java.util.Scanner;
public class DisplayOddAndEven{
    public static void main(String [] agrs) {
    Scanner in = new Scanner(System.in);
        System.out.print("Start Number : ");
        int startNumber = in.nextInt();
        System.out.print("End Number : ");
        int endNumber = in.nextInt();

        System.out.print("Even number : ");
        displayEven(startNumber ,endNumber);
        System.out.print("\tOdd number :  ");
        displayOdd(startNumber,endNumber);
    }
        public static void displayEven(int n1, int n2){
            for(int i = n1; i<=n2; i++){
                 if(i % 2 == 0){
                     System.out.print(i+" ");
                 }
        }
    }
        public static void displayOdd(int n1, int n2){
            for(int x = n1 ; x<= n2; x++){
                 if(x % 2!= 0){
                     System.out.print(x+" ");
                 }

                }
    }
}


