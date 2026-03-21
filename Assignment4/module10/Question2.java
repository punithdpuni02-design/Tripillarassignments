package Assignment4.module10;
class nNode {
    int data;
    Node next;

    nNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question2{

    Node head;


    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }


    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
      Question2 list = new Question2();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        System.out.println("Linked List after insertion at beginning:");
        list.display();
    }
}