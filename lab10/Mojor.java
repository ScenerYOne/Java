import java.util.ArrayList;
class Major {
    private String name;
    private ArrayList<Student> students;

    public Major(String n, ArrayList<Student> s) {
        this.name = n;
        this.students = s;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public boolean deleteStudent(Student student) {
        return this.students.remove(student);
    }

    public String toString() {
        return "Major " + name + ": " + students.size() + " Students";
    }
}








