

import java.util.Scanner;

public class LoginVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Login Verification Program => Search Menu");
        Login login1 = new Login("SD0010", "Sd5648**");
        Login login2 = new Login("SD0011", "Sd0001**");
        Login login3 = new Login("SD0012", "Sd0002**");
        Login login4 = new Login("SD0013", "Sd0003**");
        Login login5 = new Login("SD0100", "Sd5648#55");

        // Create Students
        Student student1 = new Student("65100000", "AAA", login1);
        Student student2 = new Student("65110000", "BBB", login2);
        Student student3 = new Student("65120000", "CCC", login3);
        Student student4 = new Student("65130000", "DDD", login4);
        Student student5 = new Student("65130011", "FFF", login5);

        // Create Majors
        Major majorCOE = new Major("COE");
        majorCOE.getStudents().add(student1);
        majorCOE.getStudents().add(student2);
        majorCOE.getStudents().add(student3);

        Major majorCPE = new Major("CPE");
        majorCPE.getStudents().add(student4);
        majorCPE.getStudents().add(student5);

        // Set major for each student
        student1.setMajor(majorCOE);
        student2.setMajor(majorCOE);
        student3.setMajor(majorCOE);
        student4.setMajor(majorCPE);
        student5.setMajor(majorCPE);

        char continueProgram = ' ';
        do {
            System.out.print("\nEnter id: ");
            String studentID = scanner.next();

            Student currentStudent = findStudent(studentID, majorCOE, majorCPE);
            if (currentStudent == null) {
                System.out.println("Invalid Student ID");
            } else {
                System.out.print("Enter username: ");
                String username = scanner.next();

                System.out.print("Enter password: ");
                String password = scanner.next();

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
            
            continueProgram = scanner.next().charAt(0);
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
