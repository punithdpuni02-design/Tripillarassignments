package Assignment4.module10;
class Q5 {
    int data;
    Node next;

    Q5(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question5 {

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

    // Count nodes
    int countNodes() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {
       Question5 list = new Question5();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Number of nodes: " + list.countNodes());
    }
}
