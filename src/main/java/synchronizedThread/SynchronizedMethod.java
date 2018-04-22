package main.java.synchronizedThread;

public class SynchronizedMethod {

    private int counter = 0;

    public static void main(String[] args) {
        SynchronizedMethod sync = new SynchronizedMethod();
        sync.countFirstInTheAir();
    }

    private void countFirstInTheAir() {
        Runnable count = () -> {
            for (int i = 0; i < 5000; i++) {
                increment();
            }
        };

        Thread first = new Thread(count);
        Thread second = new Thread(count);

        first.start();
        second.start();

        try {
            first.join();
            second.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The number of first " + counter);
    }

    private synchronized void increment() {
        counter++;
    }
}
