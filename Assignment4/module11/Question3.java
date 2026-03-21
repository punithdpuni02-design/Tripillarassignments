package Assignment4.module11;
import java.util.Stack;

public class Question3 {


    static void insertAtBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }

        int temp = stack.pop();
        insertAtBottom(stack, x);

        stack.push(temp);
    }


    static void reverse(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            reverse(stack);
            insertAtBottom(stack, temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Original Stack: " + stack);

        reverse(stack);

        System.out.println("Reversed Stack: " + stack);
    }
}