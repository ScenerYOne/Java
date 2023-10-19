import java.util.Scanner;
public class Distance {
    public static void main(String[] args ) {
    Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
            double sum = Math.sqrt(x*x+y*y);
            System.out.println("distance from("+Math.sqrt(x*x+y*y)+","+Math.sqrt(x*x+y*y)+")to (0,0)= "+Math.sqrt(x+y));
    }
    }
