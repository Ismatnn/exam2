package task.two;
import java.util.*;

public class WordCountProgram {
    public static void main(String[] args) {
        List<String> sentenceList = new ArrayList<>();
        sentenceList.add("This is the first sentence.");
        sentenceList.add("The second sentence has more words.");
        sentenceList.add("This is the last sentence.");

        for (String sentence : sentenceList) {
            int wordCount = getWordCount(sentence);
            System.out.println("Sentence: " + sentence);
            System.out.println("Word Count: " + wordCount);
            System.out.println();
        }
    }

    private static int getWordCount(String sentence) {
        String[] words = sentence.split(" ");
        return words.length;
    }
}
