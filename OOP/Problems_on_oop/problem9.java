package OOP.Problems_on_oop;

class TypePromotionDemo {
    byte a = 10;
    char b = 20;
    short c = 30;
    int d = 40;
    float f = 50.0f;
    double g = 60.0;

    TypePromotionDemo(byte a, char b, short c, int d, float f, double g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.g = g;
    }

    void calculate() {
        double result = a + b + c + d + f + g;
        System.out.println("Result after Type Promotion: " + result);
    }

}

public class problem9 {
    public static void main(String[] args) {
        TypePromotionDemo tp = new TypePromotionDemo(
                (byte)10,   // byte
                (char)20,   // char
                (short)30,  // short
                40,         // int
                50.0f,      // float
                60.0        // double
        );
        tp.calculate();
    }
}
