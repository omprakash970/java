package Synchronization;

import java.sql.ShardingKey;

class SharedResource{
    synchronized void methodA(SharedResource sr){
        System.out.println(Thread.currentThread().getName()+" locked resources A");
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" waiting for resources B");
        synchronized (sr){
            System.out.println(Thread.currentThread().getName()+" locked resources B");
        }
    }
    synchronized void methodB(SharedResource sr){
        System.out.println("Thread.currentThread().getName()+\" locked resources B\"");
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" Waiting for resources B");
        synchronized (sr){
            System.out.println(Thread.currentThread().getName()+" locked resources A");
        }
    }

}




public class deadlock {
    public static void main(String[] args){
        SharedResource sr1=new SharedResource();
        SharedResource sr2=new SharedResource();
        Thread t1=new Thread(){
            public void run(){
                sr1.methodA(sr2);
            }
        };
        Thread t2=new Thread(){
            public void run(){
                sr2.methodB(sr1);
            }
        };
        t1.start();
        t2.start();
    }

}
