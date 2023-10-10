import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SmallestAndLargestElements {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(5);
        al.add(5);
        al.add(3);
        al.add(50);

        Collections.sort(al);

        int secondSmallestElement = al.get(1);
        System.out.println("The second smallest element :"+secondSmallestElement);

        int secondLargestElement = al.get(al.size()-2);
        System.out.println("The second largest element  :"+secondLargestElement);

        al.stream().sorted().forEach(System.out::println);

        Optional<Integer> min = al.stream().min(Integer::compare);
        System.out.println("The smallest element:"+min.get());

        long count = al.stream().count();
        System.out.println(count);

        double average = al.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(average);

        List<Integer> distinct = al.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);


    }
}
