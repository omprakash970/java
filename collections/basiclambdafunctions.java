package collections;
import java.util.*;
import java.util.ArrayList;
interface Multiplication{
    int multiply(int a, int b); 
}


public class basiclambdafunctions {
   public static void main(String[] args){
    ArrayList<String>list= new ArrayList<>();
    list.add("Oppie"); 
    list.add("Nancy");
    list.forEach( (n) -> System.out.println(n) );
    list.forEach( n -> System.out.println(n) );
   }
}
