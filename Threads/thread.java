package Threads;
import java.lang.Thread;
import java.lang.Runnable;
class MyRunnable implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread " );
        }
    }
}

public class thread {
    public static void main(String[] args){
        MyRunnable r= new MyRunnable();
        Thread t= new Thread();
        t.start();
    
        Thread t2= new Thread(r);
        t2.start();
       
    }

    
}
