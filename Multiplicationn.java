import java.util.Scanner;
public class Multiplicationn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        char ch;
        do {
            do{
                System.out.print("number[2 to 12] : ");
                    number=sc.nextInt();
                if(number>12||number<2){
                    System.out.println("invalid data,please try again.");
                }
            }while(number>12||number<2);
            
            displayMul(number);

            System.out.print("Do you want to continue [y/n] : ");
            ch=sc.next().charAt(0);


        } while (ch == 'y');
        System.out.print("Bye Bye ");
    }
    

    public static void displayMul(int number){
        for(int i = 1;i<=12;i++){
            System.out.println(number + " X " + i + " = "+(number*i));
        }
    }
}
