import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    java.util.Scanner sc = new Scanner(System.in);
    System.out.println("P1 (x,y): ");
        int px1 = sc.nextInt();
        int py1 = sc.nextInt();
    System.out.println("P2 (x,y): ");
        int px2 = sc.nextInt();
        int py2 = sc.nextInt();
        int calulate = Math.abs(px1 - px2) + Math.abs(py1-py2);
    System.out.println("Manhattan Distance = "+calulate);
    }
}