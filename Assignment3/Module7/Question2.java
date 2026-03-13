package Assignment3.Module7;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, key;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements in sorted order:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        key = sc.nextInt();

        int low = 0, high = n - 1, mid;
        boolean found = false;

        while(low <= high) {
            mid = (low + high) / 2;

            if(arr[mid] == key) {
                System.out.println("Element found at position: " + (mid + 1));
                found = true;
                break;
            }
            else if(arr[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if(!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
