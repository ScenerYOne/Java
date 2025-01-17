class Student {
    private final Login login;
    private String studentID;
    private String name;
    private Major major;

    Student(String id, String n, Login l) {
        this.studentID = id;
        this.name = n;
        this.login = l;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public Login getLogin() {
        return this.login;
    }

    public Major getMajor() {
        return this.major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public String toString() {
        return "ID: " + studentID + ", Name: " + name;
    }
}