package Module5;
class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Thread is running using Runnable interface...");
    }
}

public class Question7 {
    public static void main(String[] args) {

        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}