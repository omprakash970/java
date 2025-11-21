package collections;
import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class streamapi {
    public static void main(String[] args){
        ArrayList<String>list= new ArrayList<>();
        list.add("Oppie");
        list.add("Nancy");
        List<String>result = list.stream().filter(n -> n.startsWith("N")).collect(Collectors.toList());
         System.out.println(result);
    }
}
