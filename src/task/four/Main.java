package task.four;
import java.util.*;

public class Main {
    public static <T> Collection<T> getUniqueElements(Collection<T> collection) {
        Set<T> uniqueElements = new HashSet<>(collection);
        return uniqueElements;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);

        Collection<Integer> uniqueNumbers = getUniqueElements(numbers);
        System.out.println("Unique Numbers: " + uniqueNumbers);
    }
}
