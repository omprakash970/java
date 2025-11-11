package Threads;
import java.lang.Thread;
import java.lang.Runnable;
class Mythread extends Thread{

}

public class thread {
    public static void main(String[] args){
       System.out.println(Thread.currentThread().getName());
       Mythread t1=new Mythread();
       System.out.println(t1.getName());
       Thread.currentThread().setName("Oppie thread");
       System.out.println(Thread.currentThread().getName());

    }

    
}
