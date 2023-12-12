
public class Student {
    private String studentID;
    private String name;
    private Login login;
    private Major major;

    public Student(String studentID, String name, Login login) {
        this.studentID = studentID;
        this.name = name;
        this.login = login;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public Login getLogin() {
        return login;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }


    public String toString() {
        return "ID: " + studentID + " Name: " + name;
    }
}
