public class Que_2 {
    public static void main(String args[]){
 person p = new person();
 p.name = "Manoj";
 System.out.println(p.name);

    }
}
class person{
    String name;
    int weight;
}

class Student extends person{
    int rollNumber;
    String schoolName;
}
