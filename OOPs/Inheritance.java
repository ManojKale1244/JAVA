

public class Inheritance {
   public static void main(String[] args) {
    Fish F = new Fish();
    F.eat();
    
   } 
}
class Animal 
{
    String name;

    void eat(){
        System.out.println("eat's");
    }

    void breath(){
        System.out.println("breathes");
    }
}

class Fish extends Animal {
    String name;
    void swiming(){

    }
}
