package All_mix;
import java.lang.Thread; 
class Mythread extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }
}
public class thread_creation_start_and_running {
    public static void main(String[] args){
        Mythread t1 = new Mythread(); 
        t1.start(); 

    } 
    
}
