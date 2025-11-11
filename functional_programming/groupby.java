package functional_programming;
import java.util.*; 
import java.util.stream.*;

public class groupby {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Alice", "Cob", "Aharlie", "Cavid", "Ave", "Arank");
        Map<Character, List<String>> groupedNames= names.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(groupedNames);
    }
    
}
