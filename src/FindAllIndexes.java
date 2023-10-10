import java.util.ArrayList;
import java.util.List;

public class FindAllIndexes {
    public static void main(String[] args) {
        String inputString = "Hello World";
        char targetChar = 'o';

        List<Integer> indexes = findIndexes(inputString, targetChar);

        if (!indexes.isEmpty()) {
            System.out.println("Indexes of '" + targetChar + "' in the string are: " + indexes);
        } else {
            System.out.println("'" + targetChar + "' not found in the string.");
        }
    }

    private static List<Integer> findIndexes (String inputString,char targetChar){

        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (targetChar == inputString.charAt(i))
                  indexes.add(i);
        }
        return indexes;
    }
}
