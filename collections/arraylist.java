package collections;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(100); 
        list.add(200);
        list.add(300);
        System.out.println("ArrayList: " + list);
        list.removeLast();
        list.removeFirst();
        list.add(1, 150);
        list.set(1, 175);
        System.out.println("After removing first and last elements: " + list);

        System.out.println("Element at index 1:"+ list.get(1));

    }

}
