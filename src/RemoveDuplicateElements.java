import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);

        List<Integer> uniqueelemets = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println("Original Elements:"+numbers);
        System.out.println("After Removing Duplicates:"+uniqueelemets);
    }
}
