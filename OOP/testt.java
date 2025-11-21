package OOP;
// GOOD DESIGN: abstract method
abstract class Animal2 {
    abstract void sound();   // MUST be implemented
}

class Dog2 extends Animal2 {
    void sound() {
        System.out.println("Dog: Bark! Bark!");
    }
}

class Snake2 extends Animal2 {
    // MUST override
    void sound() {
        System.out.println("Snake: Hissssss!");
    }
}

public class testt {
     public static void main(String[] args) {

    
        Animal2 a1 = new Dog2();
        a1.sound();  // Dog: Bark! Bark!

        Animal2 a2 = new Snake2();
        a2.sound();  // Snake: Hissssss!
    }
    
}
