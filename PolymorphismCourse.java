import java.util.ArrayList;
public class PolymorphismCourse {
    public static void main(String[] args) {
        ArrayList<Course> list = new ArrayList<>();
        list.add(new GenEdCourse("GEN64-124", 4, "D+"));
        list.add(new GenEdCourse("GEN64-183", 1, "A "));
        list.add(new GenEdCourse("ITD64-172", 2, "C+"));
        list.add(new MajorCourse("COE64-211", 4, "D", 2));
        list.add(new MajorCourse("COE64-212", 4, "D", 2));
        list.add(new MajorCourse("COE64-322", 4, "W", 3));

        System.out.println("General Education Courses: ");
        for (Course course : list) {
            if (!(course instanceof MajorCourse)) {
                System.out.println(course.toString());
            }
        }

        int totalStudentsGenEd = calEnroll(list, "GenEd");
        int passedStudentsGenEd = calPassSubject(list, "GenEd");
        System.out.println("Enroll: " + totalStudentsGenEd + " Pass: " + passedStudentsGenEd);
        System.out.println("============================================");

        System.out.println("Major Courses: ");
        displayCourse(list, "Major");
        int totalStudentsMajor = calEnroll(list, "Major");
        int passedStudentsMajor = calPassSubject(list, "Major");
        System.out.println("Enroll: " + totalStudentsMajor + " Pass: " + passedStudentsMajor);

        double gpa = calGPA(list);
        System.out.printf("GPA: %.3f\n", gpa);

        System.out.println("Search Course:");
        searchCourse(list, 2);
        searchCourse(list, 3);
        searchCourse(list, 1);
    }

    public static void displayCourse(ArrayList<Course> c, String m) {
        for (Course course : c) {
            if (course instanceof MajorCourse && m.equals("Major")) {
                System.out.println(course.toString() + " Year " + ((MajorCourse) course).getYear());
            }
        }
    }

    public static int calPassSubject(ArrayList<Course> c, String m) {
        int passedStudents = 0;

        for (Course course : c) {
            if ((m.equals("GenEd") && !(course instanceof MajorCourse))
                    || (m.equals("Major") && (course instanceof MajorCourse))) {
                if (!course.getGrade().equals("W") && !course.getGrade().equals("F")) {
                    passedStudents++;
                }
            }
        }
        return passedStudents;
    }

    public static double calGPA(ArrayList<Course> c) {
        double totalGradePoints = 0;
        int totalUnits = 0;

        for (Course course : c) {
            if (!course.getGrade().equals("W")) {
                totalUnits += course.getUnit();
                totalGradePoints += convertGradeToPoint(course.getGrade(), course.getUnit());
            }
        }

        return totalGradePoints / totalUnits;
    }

    public static void searchCourse(ArrayList<Course> c, int year) {
        boolean found = false;
        for (Course course : c) {
            if (course instanceof MajorCourse && ((MajorCourse) course).getYear() == year) {
                System.out.println(course.getCouresID() + " " + course.getUnit() + " Year " + ((MajorCourse) course).getYear() + " " + course.getGrade());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }
    

    public static double convertGradeToPoint(String grade, int unit) {
        switch (grade.trim()) {
            case "A":
                return 4 * unit;
            case "B+":
                return 3.5 * unit;
            case "B":
                return 3 * unit;
            case "C+":
                return 2.5 * unit;
            case "C":
                return 2 * unit;
            case "D+":
                return 1.5 * unit;
            case "D":
                return 1 * unit;
            default:
                return 0;
        }
    }

    public static int calEnroll(ArrayList<Course> c, String m) {
        int count = 0;
        for (Course course : c) {
            if ((m.equals("GenEd") && !(course instanceof MajorCourse))
                    || (m.equals("Major") && (course instanceof MajorCourse))) {
                count++;
            }
        }
        return count;
    }
}