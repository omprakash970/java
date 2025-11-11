package Threads;
import java.lang.Thread;
class Mythread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){

            System.out.println("Thread is running");
        }
    }
}

public class thread {
    public static void main(String[] args){
        Mythread t1= new Mythread();
        t1.start();
    }

    
}
