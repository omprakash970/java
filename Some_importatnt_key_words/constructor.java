package Some_importatnt_key_words;

class donstructor {
    int id;
    String name;

    donstructor() {
        id = 25;
        name = "Oppie";
    }

    donstructor(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }
}

public class constructor {
    public static void main(String[] args) {
        donstructor obj1 = new donstructor();
        donstructor obj2 = new donstructor(30, "Java");

        obj1.display();
        obj2.display();
    }

}
