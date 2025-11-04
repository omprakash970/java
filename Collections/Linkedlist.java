package Collections;
import java.util.*; 
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Object> al= new LinkedList<Object>(); 
        al.add(1);
        al.add(2);
        al.add(3);
        al.add("Ravi");
        al.addFirst("Oppie");
        Iterator<Object> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        


        
    }
    
}
