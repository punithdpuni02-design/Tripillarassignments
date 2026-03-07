package Module4;

abstract class Question {

    abstract void display();
}

class Circle extends Question {

    // Implementing the abstract method
    void display() {
        System.out.println("This is a Circle shape.");
    }
}

public class Question1 {
    public static void main(String[] args) {

        Circle c = new Circle();

        c.display();
    }
}
