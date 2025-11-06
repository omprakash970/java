package OOP.Problems_on_oop;
class Calculator{
    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public double divide(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

}

public class problem7 {
    public static void main(String[] args){
        Calculator calc = new Calculator(); 
        int a=20; 
        int b=10;
        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));
    }
    
}
