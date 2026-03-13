package Assignment3.Module9;
import java.util.Scanner;

public class Question2 {

    int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case
        }
        return n * factorial(n - 1); // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        FactorialRecursion obj = new FactorialRecursion();
        int result = obj.factorial(num);

        System.out.println("Factorial of " + num + " is: " + result);

        sc.close();
    }
}
