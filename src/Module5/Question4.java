package Module5;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class Question4{

    static void checkNumber(int num) throws MyException {
        if (num < 0) {
            throw new MyException("Number cannot be negative");
        } else {
            System.out.println("Number is: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (MyException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}
