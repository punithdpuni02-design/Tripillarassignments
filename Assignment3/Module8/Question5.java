package Assignment3.Module8;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        while(num > 0) {
            count = count + (num & 1); // check last bit
            num = num >> 1; // shift right
        }

        System.out.println("Number of set bits: " + count);

        sc.close();
    }
}
