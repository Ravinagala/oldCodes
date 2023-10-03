import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStudent {
    public static void main(String[] args){

        ArrayList<Student> al = new ArrayList<>();

        al.add(new Student("Ravi",25,"C","Vizag"));
        al.add(new Student("Vinay",23,"Java","Vizag"));
        al.add(new Student("Praveen",23,"Python","Narisipatnam"));

        Map<Integer,Object> map = al.stream()
                .collect(Collectors

                                .toMap(
                                        Student::getAge, Student::toString, (x, y) -> x + ", " + y
                                        ));

        map.forEach(
                (x, y) -> System.out.println(x + "=" + y));




    }
}
