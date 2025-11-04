package Execption_handling;
import java.io.*;
class exception{
    public static void main(String[] args){
        int n=10;
        int m=0;
       try{
        int ans=n/m;
        System.out.println("The answer is: "+ans);
       } catch(ArithmeticException e){
        System.out.println("Cannot divide by zero");
       }
       finally{
        System.out.println("Program continuos after handling errors");
       }
    }
}