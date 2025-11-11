import java.util.ArrayList;
import java.util.LinkedList;
class arraylist{
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>(); 
        list.add(10); 
        list.add(20); 
        list.add(25); 
        list.add(30); 
        
        list.removeLast();
        list.addFirst(5);
        list.remove(Integer.valueOf(10)); 
        for(int i: list){
            System.out.println(i);
        }

    }
}