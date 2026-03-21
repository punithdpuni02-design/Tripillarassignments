package Assignment4.module10;
class q4 {
    int data;
    Node next;

    q4(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question4 {

    Node head;

    // Insert at end (for testing)
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete node by value
    void delete(int key) {

        // Case 1: list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Case 2: head node needs to be deleted
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;

        // Search for the key
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // Case 3: value not found
        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        // Case 4: delete node
        prev.next = temp.next;
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
        Question4 list = new Question4();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Before deletion:");
        list.display();

        list.delete(20);

        System.out.println("After deleting 20:");
        list.display();
    }
}