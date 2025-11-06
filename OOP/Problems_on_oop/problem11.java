package OOP.Problems_on_oop;
class Company {

    // final variable → cannot be changed
    final String POLICY = "Company policy: Maintain integrity and innovation.";

    // final method → cannot be overridden
    final void showVision() {
        System.out.println("Company Vision: To be the global leader in tech solutions.");
    }
}

class Employee extends Company {

    // ❌ Trying to override final method (UNCOMMENT to see error)
    /*
    void showVision() {
        System.out.println("Trying to change company vision...");
    }
    */

    // Method to demonstrate final variable behavior
    void displayDetails() {
        System.out.println("Accessing POLICY from Employee: " + POLICY);

        // ❌ Trying to modify final variable (UNCOMMENT to see error)
        // POLICY = "New policy changed by employee!";
    }
}

public class problem11 {
     public static void main(String[] args) {

        Employee emp = new Employee();

        System.out.println("=== Demonstrating Allowed Behavior ===");
        emp.displayDetails();      // Accessing final variable
        emp.showVision();          // Calling final method

        System.out.println("\n=== Demonstrating Restricted Behavior ===");
        System.out.println("1. Attempting to modify POLICY → Not Allowed ❌");
        System.out.println("2. Attempting to override showVision() → Not Allowed ❌");

        System.out.println("\nJava prevents modifying final variables and overriding final methods.");
    }
    
}
