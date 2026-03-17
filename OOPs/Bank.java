import java.rmi.StubNotFoundException;

public class Bank {
    public static void main(String[] args) {
        Student s1 = new Student("Manoj Kale");
        Student s2 = new Student(60);
        System.out.println(s1.name);
    }
}
class Student {
    String name;
    int roll;
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}