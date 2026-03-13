package Assignment3.Module9;
import java.util.Scanner;

public class Question1 {

    void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        PrintNumbersRecursion obj = new PrintNumbersRecursion();
        obj.printNumbers(n);

        sc.close();
    }
}
