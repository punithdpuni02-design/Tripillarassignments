package Assignment4.module8;
public class Question3 {
    public static void main(String[] args) {
        String sentence = "Java is difficult than phyton";

        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Sentence: " + sentence);
        System.out.println("Longest word: " + longestWord);
    }
}
