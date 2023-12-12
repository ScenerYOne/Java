
import java.util.ArrayList;

public class Major {
    private String name;
    private ArrayList<Student> students;

    public Major(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public boolean deleteStudent(Student student) {
        return students.remove(student);
    }


    public String toString() {
        return "Major " + name + ": " + students.size() + " Students";
    }
}
