package functional_programming;
import java.util.*;
import java.util.stream.*;
public class partitioning {
    public static void main(String[] args){
        List<Integer>numbers=Arrays.asList(1,2,3,4,5,6);
        Map<Boolean, List<Integer>>result=numbers.stream().collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println(result);
    }
    
}
