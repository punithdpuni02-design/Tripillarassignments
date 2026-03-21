package Assignment4.module8;
public class Question2 {
    public static void main(String[] args) {
        String sentence = "SNPSU is best";

        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            String reversedWord = "";

            // Reverse each word
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }

            result += reversedWord + " ";
        }

        System.out.println("Original Sentence: " + sentence);
        System.out.println("Modified Sentence: " + result.trim());
    }
}