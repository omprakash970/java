package Some_importatnt_key_words;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Name: " + this.name);
    }

}

public class this_ {
    public static void main(String[] args) {
        Person p = new Person("Oppie");
        p.show();
    }
}
