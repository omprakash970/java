package Synchronization;
import java.lang.Thread;
import java.util.concurrent.*;


public class ProducerConsumer {
    public static void main(String[] args){
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);
        Runnable producer=()->{
            for(int i=1;i<=5;i++){
                try {
                    queue.put(i);
                    System.out.println("Produced: " + i);
            }catch(InterruptedException e){
                    e.printStackTrace();
                }

            }
        };
        Runnable consumer=()->{
            for(int i=1;i<=5;i++){
                try{
                    int item =queue.take(); 
                    System.out.println("consumed:", item );

                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        new Thread(producer).start();
        new Thread(consumer).start();
    }
    
}
