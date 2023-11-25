import java.util.ArrayList;
class Human {
    String name;
    int age;
    String id;
    ArrayList<SmartPhone> smartPhones; 

    Human(String name, int age, String id, ArrayList<SmartPhone> smartPhones) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.smartPhones = smartPhones;
    }

    public String toString() {
        return "Name: " + name + " Age: " + age + " ID: " + id + " has " + smartPhones.size() + " Smart Phones";
    }
}
