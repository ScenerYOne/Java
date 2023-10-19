import java.util.Scanner;
public class DisplayArea {
    public static void main (String[] args){
        int choice; int w,h,r; double area;
        Scanner input = new Scanner (System.in);  
        System.out.println("Program Calculate Area");
        System.out.println("====================================");
        System.out.println("Press 1: Square");
        System.out.println("Press 2: Rectangle");
        System.out.println("Press 3: Exit");

        do {
            System.out.print("Press Number: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Please enter Width: ");
                    w = input.nextInt();
                    area = w * w;
                    System.out.println("Area = " + area);
                    break;
                case 2:
                    h = input.nextInt();
                    w = input.nextInt();
                    area = w*h;
                    System.out.print ("Area = " + area);  
                    break;
                  default: System.out.print ("Bye Bye !!\n");
            }
        }while (choice !=3);    
    }
   
}
