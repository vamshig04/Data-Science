class MyThread extends Thread {
    // Constructor
    MyThread(String name) {
        super(name); // Call base class constructor
        start();     // Start the thread immediately
    }

    // Run method
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running: " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // Create child thread
        MyThread t1 = new MyThread("ChildThread");

        // Main thread execution
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread is running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
    }
}
