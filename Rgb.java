import java.util.Scanner;
public class Rgb {
    public static void main(String[] agrs){
    Scanner sc = new Scanner(System.in);
        System.out.print("RGB Color1 : ");
        Float r1 = sc.nextFloat();
        Float g1 = sc.nextFloat();
        Float b1 = sc.nextFloat();
         System.out.print("RGB Color2 : ");
        Float r2 = sc.nextFloat();
        Float g2 = sc.nextFloat();
        Float b2 = sc.nextFloat();
        double d = Math.sqrt(Math.pow(r2-r1,2)+Math.pow(g2-g1,2)+Math.pow(b2-b1,2));
        System.out.println("Color Difference = "+ d);


    }

   
    }

