package functional_programming;
interface Car {
    void drive();   
}



public class lambda {
public static void main(String[] args){
    Car c=()->{
        System.out.println("Driving a car using lambda expression");
    };
    c.drive();
}
    
}
