import java.util.Scanner;
public class Pizza {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius,price;
        double area,Priceperinch;
        System.out.print("Enter radius : ");
        radius = in.nextInt();
        System.out.print("Enter price : ");
        price = in.nextInt();
        area = (3.14)*(double)radius*(double)radius;
        Priceperinch=price/area;
        System.out.println(Priceperinch);
        System.out.println(Priceperinch);
    }
}

