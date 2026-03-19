public class Que5 {
    public static void main(String[] args) {
       Vehicle V = new Vehicle();
       V.print(); 
       Car C = new Car();
       C.print(); 
    }
}
class Vehicle{
    void print(){
        System.out.println("Base Class(Vehicle)");
    }
}

class Car extends Vehicle{
    void print(){
        System.out.println("Derived Class(Car)");
    }
}