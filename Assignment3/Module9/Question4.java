package Assignment3.Module9;
import java.util.Scanner;

public class Question4{

    static void generateSubsets(int[] arr, int n, int index, String current) {
        if (index == n) {
            System.out.println(current);
            return;
        }

        // Include the current element
        generateSubsets(arr, n, index + 1, current + arr[index] + " ");

        // Exclude the current element
        generateSubsets(arr, n, index + 1, current);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Subsets are:");
        generateSubsets(arr, n, 0, "");

        sc.close();
    }
}