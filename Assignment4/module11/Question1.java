package Assignment4.module11;
import java.util.Scanner;

class S1 {
    int maxSize;
    int[] stackArray;
    int top;


    S1(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }


    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed to stack");
    }


    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stackArray[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }


    boolean isEmpty() {
        return (top == -1);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }
}

public class Question1 {
    public static void main(String[] args) {
        S1 s = new S1(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top element: " + s.peek());

        System.out.println("Popped: " + s.pop());

        System.out.println("Stack elements:");
        s.display();
    }
}
