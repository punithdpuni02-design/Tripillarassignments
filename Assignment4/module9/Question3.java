package Assignment4.module9;
import java.util.Scanner;

public class Question3 {


    static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        int a = sc.nextInt();

        System.out.print("Enter exponent (b): ");
        int b = sc.nextInt();

        int result = power(a, b);
        System.out.println("Result = " + result);
    }
}