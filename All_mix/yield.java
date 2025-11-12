
import java.lang.*;
import java.lang.Thread;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child");
            Thread.yield();
        }
    }
}

public class yield {
    public static void main(String[] args) {
        new MyThread().start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main");
        }
    }
}
