package collections;
import java.util.*;

class Student{
    int id; 
    String name; 
    int marks; 
    Student(int id, String name, int marks){
        this.id=id; 
        this.marks=marks;
        this.name=name;
    }
    public String toString(){
        return this.id+" "+this.name+" "+this.marks;
    }
}
class SortByName implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name); 
    }
}

public class compartors {
    public static void main(String[] args){

    }

    
}
