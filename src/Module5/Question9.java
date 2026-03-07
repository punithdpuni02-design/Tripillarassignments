package Module5;

class ThreadLifeCycle extends Thread {

    public void run() {
        System.out.println("Thread is in Running state");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread execution finished");
    }

    public static void main(String[] args) {

        ThreadLifeCycle t1 = new ThreadLifeCycle();

        System.out.println("State after creating thread: " + t1.getState());

        t1.start();

        System.out.println("State after starting thread: " + t1.getState());

        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("State after thread completes: " + t1.getState());
    }
}