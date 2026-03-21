package Assignment4.module9;
import java.util.Scanner;

public class Question1{


    static void printNumbers(int n) {
        if (n == 0) {
            return; // base case
        }
        System.out.print(n + " ");
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printNumbers(n);
    }
}