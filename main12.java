
class Task1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Task1: " + i);
            try {
                Thread.sleep(500); // pause for 0.5 second
            } catch (InterruptedException e) {
                System.out.println("Task1 interrupted");
            }
        }
    }
}

class Task2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Task2: " + i);
            try {
                Thread.sleep(700); // pause for 0.7 second
            } catch (InterruptedException e) {
                System.out.println("Task2 interrupted");
            }
        }
    }
}

public class main12 {
    public static void main(String[] args) throws InterruptedException {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        t1.setName("Thread-A");
        t2.setName("Thread-B");

        t1.start(); // start first thread
        t2.start(); // start second thread

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Both threads have finished execution");
    }
}
