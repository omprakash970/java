import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap; 

class arraylist{
    public static void main(String[] args) {
        HashMap<Integer, String> map= new HashMap<>(); 
        map.put(1, "Oppie");
        map.put(2, "java"); 
        System.out.println(map);
        for(Integer key: map.keySet()){
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

       
    }
}