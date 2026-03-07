package Module4;

class Student{
    int id;
    String name;
    static String college = "ABC College"; // static variable

    Student(int i, String n) {
        id = i;
        name = n;
    }

    static void changeCollege() {
        college = "XYZ College";
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}

public class Question6 {
    public static void main(String[] args) {

        Student.changeCollege();

        Student s1 = new Student(1, "Rahul");
        Student s2 = new Student(2, "Anita");

        s1.display();
        s2.display();
    }
}
