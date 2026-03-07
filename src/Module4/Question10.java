package Module4;

public class Question10 {

    static int number;

    static {
        System.out.println("Static block is executed.");
        number = 100;
    }

    public static void main(String[] args) {
        System.out.println("Value of number: " + number);
    }
}
