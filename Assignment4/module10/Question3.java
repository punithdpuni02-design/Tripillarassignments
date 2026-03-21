package Assignment4.module10;
class node {
    int data;
    Node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question3 {

    Node head;

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        // Traverse to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Insert at end
        temp.next = newNode;
    }

    // Display list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
    Question3 list = new Question3 ();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Linked List after insertion at end:");
        list.display();
    }
}

