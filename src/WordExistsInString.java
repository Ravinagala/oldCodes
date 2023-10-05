import java.util.Arrays;

public class WordExistsInString {
    public static void main(String[] args) {
        String inputString = "This is a sample string";

        String existingWord = "sample";

        String[] words = inputString.split("\\s+");

        boolean exists = Arrays.stream(words)
                .anyMatch(word -> word.equalsIgnoreCase(existingWord));

        if(exists){
            System.out.println("The word "+ existingWord + " is present in the given string");
        }else
            System.out.println("The word "+ existingWord + "is present in the given string");
    }
}
