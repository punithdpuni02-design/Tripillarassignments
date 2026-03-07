package Module4;

public class Question8 {
    public static void main(String[] args) {

        String str = "Hello";
        str.concat(" World");
        System.out.println("String: " + str);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf);
    }
}
