package Module5;


class MyThread extends Thread {

    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Question6{
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();
    }
}
