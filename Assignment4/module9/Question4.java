package Assignment4.module9;
import java.util.Scanner;

public class Question4 {


    static void generateBinary(int n, String current) {
        if (n == 0) {
            System.out.println(current);
            return;
        }

        // Add '0'
        generateBinary(n - 1, current + "0");

        // Add '1'
        generateBinary(n - 1, current + "1");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length n: ");
        int n = sc.nextInt();

        generateBinary(n, "");
    }
}