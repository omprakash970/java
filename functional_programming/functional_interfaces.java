package functional_programming;
/*  
Functional Intefaces in java: 
* A functional interface is an interface that contains only one abstract method.
* They can have multiple default or static methods, but only one abstract method.
* Functional interfaces are used as the basis for lambda expressions in Java.
* It includes, Predicate, Consume, Optional(Supplier, Function, but not used unless they asked)
 * 
 */

import java.util.function.Predicate;
import java.util.function.Consumer;



public class functional_interfaces {
    public static void main(String[] args){
        Consumer<String> printUpper=s->System.out.println(s.toUpperCase()); 
        printUpper.accept("hello");
    }
    
}
