package OOP;

abstract class shape {
    abstract void area();
}

class Circle extends shape {
    int radius = 7;

    void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

public class abstraction {
    public static void main(String[] args) {
        shape c = new Circle();
        c.area();
    }
}
