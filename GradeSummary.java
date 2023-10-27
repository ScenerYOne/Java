import java.util.Scanner;
public class GradeSummary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter number of student : ");
        int n = in.nextInt();
        char[] G ={'A','B','C','D','F'};
        
        char []grade = new char[n];
        for(int i = 0;i < grade.length ; i++){
            System.out.print("Please enter grade of student No."+(i+1)+ " : ");
            grade[i] = in.next().charAt(0);
        }

        int []arr = new int [5];
        for(int i = 0;i<G.length;i++){
            for(int j =0;j<grade.length;j++)
            if(grade[j]==G[i]){
                arr[i]+=1;
            
            }
        }
    
        System.out.println("Grade Summary");
        System.out.print("A  \tB  \tC  \tD  \tF \t \n");
        for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i] +"\t" );
        }
    
    }
}