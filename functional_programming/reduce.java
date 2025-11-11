package functional_programming;
import java.util.*; 
import java.util.stream.*; 
public class reduce {
    public static void main(String[] args){
        List<Integer> numbers= Arrays.asList(5, 10, 23, 28); 
        int sum = numbers.stream().reduce(0, (a,b) -> a + b);
        System.out.println("Sum: " + sum);
    }

    
}
