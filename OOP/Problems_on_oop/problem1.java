package OOP.Problems_on_oop;
// Problem 1:

// Create a Student class with:

// name, age, and marks variables

// A parameterized constructor using this keyword

// A display() method to print details

// In main(), create 2 students and display their info

// 💡 Hint: practice using this to avoid variable shadowing.

class Student {
    int age;
    String name;
    int marks;

    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }
}

public class problem1 {
    public static void main(String[] args) {
        Student s1 = new Student("Oppie", 20, 95);
        Student s2 = new Student("Nancy", 22, 90);
        s1.display();
        s2.display();

    }

}
