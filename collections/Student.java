package collections; 
import java.util.LinkedList;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Queue;
public class Student{
    int id; 
    String name;
    int marks; 
    Student(int id, String name, int marks){
        this.id=id; 
        this.name=name;
        this.marks=marks;
    }

}
class sortByMarks implements Comparator<Student>{
    public int compare(Student a, Student b){
        return a.name.compareTo(b.name); 
    }
}
public class Student{
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>(); 
         list.add(new Student(1, "Om", 90));
            list.add(new Student(2, "Nancy", 85));
            list.add(new Student(3, "Dynamo", 95));
           collection.sort(list, new sortByMarks()); 
           System.out.println("After Sorting:");
            System.out.println(list);   

        

    }
}