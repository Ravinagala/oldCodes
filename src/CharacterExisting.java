import java.util.Arrays;

public class CharacterExisting {
    public static void main(String[] args) {
        String s = "Ravi";
        char character = 'A';

        char charToLowerCase = Character.toLowerCase(character);

        boolean exists = s.chars()

                .anyMatch(ch -> ch == charToLowerCase);

        System.out.println("Original String: " + s);
        System.out.println("Character to Check: " + character);

        if (exists) {
            System.out.println("The character exists in the string.");
        } else {
            System.out.println("The character does not exist in the string.");
        }
    }
}
