package Some_importatnt_key_words;

class Animal {
    String color = "White";

    Animal() {
        System.out.println("Animal Constructor called");
    }
}

class Dog extends Animal {
    String color = "Black";

    Dog() {
        super();
        System.out.println("Dog constructor called");

    }

    void show() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class superkeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();
    }

}
