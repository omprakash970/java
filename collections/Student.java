package collections; 
import java.util.*;
import java.util.ArrayList; 
import java.util.Collections;
class Students{
    int id; 
    String name; 
    int marks; 
    Students(int id, String name, int marks){
        this.id=id; 
        this.name = name; 
        this.marks = marks; 
    }
}
class SortByMarks implements Comparator<Students>{
    public int compare(Students s1, Students s2){
        return s1.marks-s2.marks; 
    }
}
public class Student{
    public static void main(String[] args){
        ArrayList<Students>list = new ArrayList<>();
        list.add( new Students(19, "Oppie", 132)); 
        list.add( new Students(20, "Nancy", 129));
        Collections.sort(list, new SortByMarks()); 
        System.out.println(list); 

}
}