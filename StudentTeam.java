import java.util.Scanner;
public class StudentTeam {
    public static void main(String[] args) {


        Student s1 = new Student("65100001","AAA",'F',20,3.23);

        Student s2 = new Student("65100002","BBB",'M',21,3.02);

        Student s3 = new Student("65100003","CCC",'M',19,2.55);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        
        System.out.print("Average age : " +((s1.getAge()+s2.getAge()+s3.getAge())/3)+" ");
        System.out.print("Average Gpax: " +((s1.getGpax()+s2.getGpax()+s3.getGpax())/3));



        
    }
}

        
    