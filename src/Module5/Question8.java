package Module5;

class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

final class MyThreads extends Thread{
    Counter c;

    MyThreads(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

public class Question8 {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        MyThreads t1 = new MyThreads(counter);
        MyThreads t2 = new MyThreads(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Counter Value: " + counter.count);
    }
}
