import java.util.Scanner;
public class CountNoOfGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of Students: ");
        int number = in.nextInt();
        char [] grade = new char[number];
        for(int i = 0;i < number ; i++){
            System.out.print("Enter grade of student"+(i+1)+": ");
            grade[i] = in.next().charAt(0);  
        }
             gradeSummary(grade);
        }
    public static void gradeSummary(char[] grades) {
    int[] frequency = new int[6]; 

    for (char grade : grades) {
        switch (grade) {
            case 'A':
                frequency[0]++;
                break;
            case 'B':
                frequency[1]++;
                break;
            case 'C':
                frequency[2]++;
                break;
            case 'D':
                frequency[3]++;
                break;
            case 'F':
                frequency[4]++;
                break;
        }
}
        System.out.println("Grade summary");
        char[]  G ={'A','B','C','D','F'};
        for (int i = 0; i < 5; i++) {
            System.out.print(G[i] + " ");
            printChar(frequency[i]);
            System.out.println();
    }
    }
    public static void printChar(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");

        }
    }
}


