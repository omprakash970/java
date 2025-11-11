package functional_programming;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class stream_api {
    public static void main(String[] args){
       ArrayList<Integer>numbers= new ArrayList<>(Arrays.asList(2, 38, 23, 42)); 
       List<Integer>EvenNumbers=numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
       List<Integer>OddNumbers=numbers.stream().filter(x->x%2!=0).collect(Collectors.toList());
       System.out.println("Even Numbers: "+EvenNumbers);
       System.out.println("Odd Numbers: "+OddNumbers);
    }

}