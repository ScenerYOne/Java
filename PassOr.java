import java.util.Scanner;
public class PassOr {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter score1: ");
        int score1 = in.nextInt();
        System.out.println("Enter score2: ");
        int score2 = in.nextInt();
        System.out.println("Enter score3: ");
        int score3 = in.nextInt();
        if(score1<50||score2<50||score3<50){
            System.out.println("Failed");
        }else{
         float mean = (score1 + score2 + score3)/3;
         System.out.println("Mean: "+mean);
        if(mean>=86){
            System.out.println("A");
        }else if(mean>=65){
            System.out.println("B");
        }else{
            System.out.println("C");
        } 
        

    }
}
}