import java.util.List;
import java.util.TreeMap;

public class MapToList {
    public static void main(String[] args) {
        TreeMap<Integer,String> numberMap = new TreeMap<>();
        numberMap.put(1,"Ravi");
        numberMap.put(2,"Praveen");
        numberMap.put(3,"Neeru");

        List<String> al = numberMap.values().stream().toList();
        System.out.println(al);
    }
}
