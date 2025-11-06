// ...existing code...
package Collections;
import java.util.*; 
import java.util.PriorityQueue;
import java.util.Comparator;
public class priorityqueue {
    public static void main(String[] args){
        // Create Comparator for alphabets objects (compare by value)
        Comparator<alphabets> MyComparator = new Comparator<alphabets>() {
            @Override
            public int compare(alphabets a1, alphabets a2) {
                return Integer.compare(a1.getValue(), a2.getValue());
            }
        };

        PriorityQueue<alphabets> q = new PriorityQueue<alphabets>(15, MyComparator);
        q.add(new alphabets("A", 1));
        q.add(new alphabets("B", 2));
        q.add(new alphabets("C", 3));
        q.add(new alphabets("D", 4));
        q.add(new alphabets("E", 5));
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

    }
    
}

class alphabets {
    private String name;
    private int value;

    public alphabets(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + ":" + value;
    }
}
