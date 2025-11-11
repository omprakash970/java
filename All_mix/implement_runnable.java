package All_mix;
import java.lang.Thread; 
class Mythread implements Runnable{
    public void run(){
        System.out.println("Thread is running...");
    }
}

public class implement_runnable {
    
    public static void main(String[] args){
        Runnable r = new Mythread(); 
        Thread t1 = new Thread(r);
        t1.start();

    }
    
}
