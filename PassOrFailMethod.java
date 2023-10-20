import java.util.Scanner;

public class PassOrFailMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student,sum,n;
        for (int i = 1;i <= 3;i++){
            System.out.println("Enter score of student "+i+" : ");
            int n1,n2,n3;
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            n3 = sc.nextInt();
            if(!isPass(n1, n2, n3)){
                System.out.println("Fail");
            }else{
                sum = (n1+n2+n3)/3;
                System.out.println("Mean = "+sum);
                if(sum>85 && sum<=100){
                    System.out.print("Grade A");
                }else if(sum>65 && sum<=85){
                    System.out.print("Grade B");
                }else if(sum>=50 && sum<=65){
                    System.out.print("Grade C");
                }
            }
        }
    }

    public static boolean isPass(int n1,int n2,int n3){
        if(n1 < 50 ||n2 < 50 ||n2 < 50 ){
            return false;
        }
        return true;
    }

}
