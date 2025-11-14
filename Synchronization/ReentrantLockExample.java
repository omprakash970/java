import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private final ReentrantLock lock = new ReentrantLock();

    void printMessage(String message) {
        lock.lock(); // acquire the lock
        try {
            System.out.println(Thread.currentThread().getName() + " -> " + message);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // always release the lock
        }
    }
}

public class ReentrantLockExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++)
                resource.printMessage("Hello from Thread-1");
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++)
                resource.printMessage("Hello from Thread-2");
        });

        t1.start();
        t2.start();
    }
}
