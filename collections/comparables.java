package collections;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student>{
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
            list.add(new Student(1, "Om", 90));
            list.add(new Student(2, "Nancy", 85));
            list.add(new Student(3, "Dynamo", 95));
            Collections.sort(list);
            System.out.println("After Sorting:");
            System.out.println(list);
            
}
}