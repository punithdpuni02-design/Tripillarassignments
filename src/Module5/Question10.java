package Module5;

class NumberPrinter {
    int number = 1;
    int max = 10;

    synchronized void printOdd() {
        while (number <= max) {
            if (number % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {}
            } else {
                System.out.println("Odd: " + number);
                number++;
                notify();
            }
        }
    }

    synchronized void printEven() {
        while (number <= max) {
            if (number % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {}
            } else {
                System.out.println("Even: " + number);
                number++;
                notify();
            }
        }
    }
}

public class Question10 {
    public static void main(String[] args) {

        NumberPrinter np = new NumberPrinter();

        Thread t1 = new Thread(() -> np.printOdd());
        Thread t2 = new Thread(() -> np.printEven());

        t1.start();
        t2.start();
    }
}
