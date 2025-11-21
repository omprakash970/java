package OOP;

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

public class encapsulation {
    public static void main(String[] args) {

        Person p = new Person();
        p.setName("Oppie");
        System.out.println(p.getName());

    }
}