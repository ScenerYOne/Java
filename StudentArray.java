import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new Student("65100001", "AAA", 'F', 20, 3.23);
        students[1] = new Student("65100002", "BBB", 'M', 21, 3.02);
        students[2] = new Student("65100003", "CCC", 'M', 19, 2.55);
        students[3] = new Student("65100004", "DDD", 'M', 21, 3.52);
        students[4] = new Student("65100005", "FFF", 'M', 20, 3.55);

        double totalGpax = 0;
        double maxGpax = Double.MIN_VALUE;
        double minGpax = Double.MAX_VALUE;
        double totalAge = 0;
        int maxAge = Integer.MIN_VALUE;
        int minAge = Integer.MAX_VALUE;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());

            double currentGpax = students[i].getGpax();
            int currentAge = students[i].getAge();

            minGpax = Math.min(minGpax, currentGpax);
            maxGpax = Math.max(maxGpax, currentGpax);

            minAge = Math.min(minAge, currentAge);
            maxAge = Math.max(maxAge, currentAge);

            totalGpax += currentGpax;
            totalAge += students[i].getAge();
        }

        System.out.println("Age");
        System.out.println("Average age: " + (totalAge / students.length) +" Min Age: " + minAge +" Max Age: " + maxAge);

        System.out.print("Average Gpax: " + (totalGpax / students.length) + " Min Gpax: " + minGpax+" Max Gpax: " + maxGpax);

    }
    }







