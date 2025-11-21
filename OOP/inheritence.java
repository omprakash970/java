package OOP;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
    void eat() {
        System.out.println("Dog is eating");
    }
}

public class inheritence {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }

}
