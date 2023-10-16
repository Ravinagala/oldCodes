import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Student> al = new ArrayList<>();

        al.add(new Student("Ravi", 25, "C", "Vizag"));
        al.add(new Student("Vinay", 23, "Java", "Vizag"));
        al.add(new Student("Praveen", 23, "Python", "Narisipatnam"));

        Map<Integer, List<Student>> map = al.stream()
                .collect(Collectors.groupingBy(Student::getAge));
        System.out.println(map);


    }
}
