package OOP.Problems_on_oop;
// Problem 2:

// Create two classes:
// Vehicle → has a speed variable and a displaySpeed() method
// Car → inherits from Vehicle, adds a variable brand
// Use super() to call the parent constructor and print both class details
// 💡 Hint: use super(speed) inside the Car constructor to initialize parent class speed.

class Vehicle {
    int speed;
    String brand;

    Vehicle(int speed, String brand) {
        this.speed = speed;
        this.brand = brand;
    }

    void displaySpeed() {
        System.out.println("Vehicle speed: " + speed + ", Brand: " + brand);
    }

}

class Car extends Vehicle {
    String brand;

    Car(int speed, String brand) {
        super(speed, brand);
        this.brand = brand;
    }

    void displaySpeed() {
        System.out.println("Car speed: " + speed + ", Brand: " + brand);
    }

}

public class problem2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(100, "Generic");
        Car car = new Car(150, "Toyota");
        vehicle.displaySpeed();
        car.displaySpeed();
    }
}