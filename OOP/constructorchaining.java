package OOP;
class Mega{
    int id; 
    String name;
    float salary;
    Mega(int id, String name, float salary){
        this.id = id; 
        this.name = name; 
        this.salary = salary;
    }
}
class hex extends Mega{
    String deparment; 
    String lover; 
    hex(int id, String name, float salary, String department, String lover){
        super(id, name, salary); 
        this.deparment = department;
        this.lover = lover;
    }
}

public class constructorchaining {
    public static void main(String [] args){
      
        hex h = new hex(102, "Alex", 55000f, "Engineering", "Nancy");
        System.out.println("ID: " + h.id + " Name: " + h.name + " Salary: " + h.salary + " Department: " + h.deparment + " Lover: " + h.lover);
    }
    
}
