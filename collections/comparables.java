package collections;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
class Student implements comparable<Student>{
    int id;
    String name; 
    int marks; 
    Student(int id, String name, int marks){
        this.id=id; 
        this.name=name; 
        this.marks=marks; 
    }
    public int compareTo(Student s){
        return this.marks-s.marks;
    }
    public String toString(){
        return this.id+" "+this.name+" "+this.marks;
    }
}
public class comparables{
    public static void main(String[] args){
             ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "Om", 92));
        list.add(new Student(102, "Nancy", 88));
        list.add(new Student(103, "Dynamo", 95));
        list.add(new Student(104, "Prakash", 91));

        System.out.println("Before Sorting:");
        System.out.println(list);

        Collections.sort(list);  

        System.out.println("After Sorting by Marks:");
        System.out.println(list);

    }
}