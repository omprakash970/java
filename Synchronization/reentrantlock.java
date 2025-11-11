package Synchronization;

import java.util.concurrent.locks.ReentrantLock;
import java.lang.Thread; 

class Counter{
    private int count=0; 
    private ReentrantLock lock = new ReentrantLock();
    void increment(){
        lock.lock(); 
        try{
            count++; 
            System.out.println(Thread.currentThread().getName() + " : " + count);

        }finally{
            lock.unlock();
        }
    }
}

public class reentrantlock {
    public static void main(String[] args){
        Counter counter = new Counter();
        Runnable task=()->{
            for(int i=0;i<5;i++){
                counter.increment();
            }
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }

    
}
