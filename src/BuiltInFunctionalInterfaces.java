import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        Consumer<String> c = (s) -> System.out.println(s.toLowerCase()); // for forEach() method
        c.accept("RAVI");

        Predicate<String> p = (s) -> (s.length() > 5); // for filter() method
        System.out.println(p.test("Niranjan"));

        Function<String,Integer> f = (s) -> s.length(); // for maps(map,mapToDouble etc..) method
        System.out.println(f.apply("ABC"));

        Supplier<Integer> sp = () -> (int) (Math.random() * 100);
        System.out.println(sp.get());
    }
}
