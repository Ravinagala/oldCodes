import java.util.HashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        TreeMap<String,String> tm = new TreeMap<>();
        tm.put("Java","Programming Language");
        tm.put("Python","Programming Language");
        tm.put("SQL","Data Base");

        System.out.println("Tree Map output");
        for(String key : tm.keySet()){
            System.out.printf("%s : %s \n",key,tm.get(key));
        }
    }
}
