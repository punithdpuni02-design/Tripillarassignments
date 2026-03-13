package Assignment3.Module6;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter value of n: ");
        n = sc.nextInt();

        int arr[] = new int[n-1];

        System.out.println("Enter " + (n-1) + " elements:");
        for(int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < n-1; i++) {
            sum = sum + arr[i];
        }

        int total = n * (n + 1) / 2;
        int missing = total - sum;

        System.out.println("Missing number is: " + missing);

        sc.close();
    }
}