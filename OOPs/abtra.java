public class abtra {
   public static void main(String[] args) {
    Horse h = new Horse();
    h.eat();
    h.walk();

    Chicken c = new Chicken();
    c.eat();
    c.walk();
   } 
}

abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }

   abstract void walk();
}

class Horse extends Animal{
   void walk(){
    System.out.println("Walk on 4 legs");
   }
   void eat(){
    System.out.println("Horse eat");
   }
}

class Chicken extends Animal{
    void walk(){
       System.out.println("Walk in 2 legs");
    }
    void eat(){
        System.out.println("Chicken eat");
    }
}
