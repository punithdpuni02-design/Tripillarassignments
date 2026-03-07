package Module5;
class Quesiton3 {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age is less than 18. Not eligible.");
        } else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {
        checkAge(19);
    }
}