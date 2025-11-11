package functional_programming;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
public class stream_api {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> evens = numbers.stream().filter(x->x%2==0).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> Squares= numbers.stream().map(x->x*x).collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Even Numbers: "+evens);
        System.out.println("Squares: "+Squares);
        


    }
    
}
