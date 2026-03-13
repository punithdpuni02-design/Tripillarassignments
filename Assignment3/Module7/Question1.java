package Assignment3.Module7;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, key, i;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        key = sc.nextInt();

        for(i = 0; i < n; i++) {
            if(arr[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                break;
            }
        }

        if(i == n) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
