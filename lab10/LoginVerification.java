import java.util.ArrayList;
import java.util.Scanner;

public class LoginVerification {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Login login = new Login("SD0010", "Sd5648**");
        Login login1 = new Login("SD0011", "Sd0001**");
        Login login2 = new Login("SD0012", "Sd0002**");
        Login login3 = new Login("SD0013", "Sd000**");
        Login login4 = new Login("SD0014", "Sd5648#55**");

        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("65100000", "AAA", login));
        s.add(new Student("65110000", "BBB", login1));
        s.add(new Student("65120000", "CCC", login2));
        ArrayList<Student> s1 = new ArrayList<>();
        s1.add(new Student("65130000", "DDD", login3));
        s1.add(new Student("65130011", "FFF", login4));

        Major coeMajor = new Major("COE", s);
        Major cpeMajor = new Major("CPE", s1);

        // Set Major for each student
        for (Student student : s) {
            student.setMajor(coeMajor);
        }
        for (Student student : s1) {
            student.setMajor(cpeMajor);
        }

        System.out.println("\n=============================================");
        System.out.println("Welcome to Login Verification Program => Search Menu");

        char continueProgram = ' ';

        do {
            System.out.print("\nEnter id: ");
            String studentID = in.next();

            Student currentStudent = findStudent(studentID, coeMajor, cpeMajor);

            if (currentStudent == null) {
                System.out.println("Invalid Student ID");
            } else {
                System.out.print("Enter username: ");
                String username = in.next();

                System.out.print("Enter password: ");
                String password = in.next();

                if (currentStudent.getLogin().isMatch(username, password)) {
                    System.out.println("Welcome to Program");
                    System.out.println("Major " + currentStudent.getMajor().getName() +
                            " ID: " + currentStudent.getStudentID() +
                            " Name: " + currentStudent.getName());
                    System.out.println(currentStudent.getLogin());
                } else {
                    System.out.println("Invalid Login");
                }
            }

            System.out.print("Continue [y/n] ");
            continueProgram = in.next().charAt(0);
            System.out.println("=======================");
        } while (continueProgram == 'y' || continueProgram == 'Y');

        System.out.println("Program Ended");
    }

    private static Student findStudent(String studentID, Major... majors) {
        for (Major major : majors) {
            for (Student student : major.getStudents()) {
                if (student.getStudentID().equals(studentID)) {
                    return student;
                }
            }
        }
        return null;
    }
}