package Synchronization;

import java.lang.Thread;

class Display {
    synchronized void display(String message) {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread extends Thread {
    Display d;
    String name;

    MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.display(name);
    }
}

public class synchronization {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Thread 1");
        MyThread t2 = new MyThread(d, "Thread 2");
        t1.start();
        t2.start();
    }
}