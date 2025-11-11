import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap; 
import java.util.Queue;

class arraylist{
    public static void main(String[] args) {
      Queue<Integer> queue = new LinkedList<>();
      queue.add(100);
      queue.add(200);
        queue.add(300);
        System.out.println("Queue elements: " + queue);
        System.out.println("Removed element: " + queue.remove());
        System.out.println("Queue after removal: " + queue);
        System.out.println("Peek element: " + queue.peek());
        
    }
}