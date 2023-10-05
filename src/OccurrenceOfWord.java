import java.util.Arrays;

public class OccurrenceOfWord {
    public static void main(String[] args) {
        String inputString = "Hello Ravi Ravi";
        String wordToCount = "Ravi";

        String[] wordsArray = inputString.split("\\s+");
        long occurrences = Arrays.stream(wordsArray)
                .filter(word -> word.equalsIgnoreCase(wordToCount))
                .count();

        System.out.println("The given string is:"+ inputString);
        System.out.println("The word to be counted:"+ wordToCount);
        System.out.println("Occurrence of a word:"+ occurrences);
    }
}
