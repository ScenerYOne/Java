class Student {
    private final Login login;
    private String studentID;
    private String name;

    Student(String id, String n, Login l){
        this.studentID = id;
        this.name = n;
        this.login = l;
    }

    public String getID(){
        return studentID;

    }

    public Login getLogin(){
        return this.login;

    }

    public String toString(){
        return "ID: " + studentID  + ", Name: " + name ;

    }
    
    
}
