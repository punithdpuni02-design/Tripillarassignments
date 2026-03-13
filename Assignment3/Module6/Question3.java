package Assignment3.Module6;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of array elements = " + sum);

        sc.close();
    }
}

