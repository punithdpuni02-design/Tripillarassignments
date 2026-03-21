package Assignment4.module11;
class Queue {
    int front, rear, size;
    int capacity;
    int[] queue;

    // Constructor
    Queue(int capacity) {
        this.capacity = capacity;
        front = 0;
        size = 0;
        rear = -1;
        queue = new int[capacity];
    }

    // Check if queue is full
    boolean isFull() {
        return (size == capacity);
    }

    // Check if queue is empty
    boolean isEmpty() {
        return (size == 0);
    }

    // Enqueue operation
    void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        System.out.println(item + " inserted");
    }

    // Dequeue operation
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Display queue
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

public class Question2 {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Dequeued: " + q.dequeue());

        q.display();
    }
}
