import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("apple");
        inputList.add("banana");
        inputList.add("cat");
        inputList.add("dog");
        inputList.add("elephant");

        List<String> outputList = new ArrayList<>();

        for (String word : inputList) {
            if (word.length() > 3) {
                outputList.add(word);
            }
        }

        System.out.println(outputList);
    }
}
