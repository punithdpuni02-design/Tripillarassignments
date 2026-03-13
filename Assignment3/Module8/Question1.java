package Assignment3.Module8;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str, rev = "";

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        int len = str.length();

        for(int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is not a Palindrome.");
        }

        sc.close();
    }
}
