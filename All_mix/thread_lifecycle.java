package All_mix;
class Mythread extends Thread{
    public void run(){
       try{
        sleep(500);
       }catch(InterruptedException e){}
System.out.println("Thread is running...");
       }
    }

public class thread_lifecycle {
    public static void main(String[] args){
        Mythread t1= new Mythread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());

    }

    
}
