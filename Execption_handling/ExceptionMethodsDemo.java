package Execption_handling;
import java.io.*;
class ExceptionMethodsDemo{
    public static void main(String[] args){
        try{
            throw new ArithmeticException("Division by zero not allowed");
        }catch(ArithmeticException e){
            System.out.println("Exception Message: "+e.getMessage());
            System.out.println("Exception toString(): "+e.toString());
            System.out.println("Stack Trace: ");
            e.printStackTrace();
        }

    }
}