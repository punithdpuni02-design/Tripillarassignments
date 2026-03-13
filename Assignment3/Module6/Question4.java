package Assignment3.Module6;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i = 1; i < n; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second largest element: " + secondLargest);

        sc.close();
    }
}
