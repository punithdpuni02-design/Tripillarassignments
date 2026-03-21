package Assignment4.module9;
import java.util.Scanner;

public class Question2 {


    static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = sumDigits(n);
        System.out.println("Sum of digits = " + result);
    }
}
