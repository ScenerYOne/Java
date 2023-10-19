import java.util.Scanner;
public class ProductElementMatrix {
    public static void main(String [] args){
    Scanner in = new Scanner(System.in);

        System.out.print("Enter matrix row and column : ");
        int number = in.nextInt();
        int column = in.nextInt();
        System.out.print("Enter Start number : ");
        int start = in.nextInt();
        int sum = 1;
        System.out.println("Display");

            for(int i=1; i<=number; i++){
                for(int j=1; j<=column; j++, start++){
                    System.out.print(start+ "\t");
                    sum *= start;

                }
                System.out.println(" ");
            }
          System.out.println("Product : " +sum);
    }
}