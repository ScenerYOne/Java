
public class Student {
    String id;
    String name;
    char gender;
    int age;
    double gpax;

    public Student() {

    }

    public Student(String id, String name, char gender, int age, double gpax) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.gpax = gpax;
    }

    public double getGpax() {
        return this.gpax;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return id + "," + name + "," + gender + "," + "Age: " + age + ", Gpax: " + gpax;
    }
}