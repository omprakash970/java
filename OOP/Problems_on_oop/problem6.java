package OOP.Problems_on_oop;

class StudentMarks {
    String name;
    int rollno;
    int[] marks;

    public StudentMarks(String name, int rollno, int[] marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    int calculateTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    int calculateAverageMarks() {
        return calculateTotalMarks() / marks.length;
    }

    void calculateGrade() {
        int avg = calculateAverageMarks();
        if (avg >= 90) {
            System.out.println("Grade: A");
        } else if (avg >= 80) {
            System.out.println("Grade: B");
        } else if (avg >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
            System.out.println("Needs Improvement");
            System.out.println("Consider seeking help from teachers or tutors.");
        }
    }
}

public class problem6 {
    public static void main(String[] args) {
        int[] marks1 = { 99, 82, 79, 91, 90 };
        StudentMarks student1 = new StudentMarks("Oppie", 1, marks1);
        System.out.println("Total Marks of " + student1.name + ": " + student1.calculateTotalMarks());
        System.out.println("Average Marks of " + student1.name + ": " + student1.calculateAverageMarks());
        student1.calculateGrade();
    }

}
