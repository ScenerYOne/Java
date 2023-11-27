import java.util.ArrayList;
class Major {
    private String name;
    private ArrayList<Student> s;

    public Major(String n, ArrayList<Student> s) {
        this.name = n;
        this.s = s;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Student> getStudent() {
        return this.s;
    }

    public boolean deleteStudent(Student student) {
        return this.s.remove(student);
    }

    public String toString() {
        return "Major " + name + ": " + s.size() + " Students";
    }
}










