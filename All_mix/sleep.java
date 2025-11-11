package All_mix;
import java.lang.Thread;
class Mythread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Sleep Thread");
            try{
                sleep(1000);
            }catch(InterruptedException e){}
        }
    }
}



public class sleep {
    public static void main(String[] args){
        Mythread t1 = new Mythread();
        t1.start();

    }
    
}
