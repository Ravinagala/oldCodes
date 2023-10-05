public class OccurrenceOfCharacter {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char charToCount = 'l'; // The character to count

        // Convert the string to a stream of characters
        long occurrenceCount = inputString.chars()
                .filter(ch -> ch == charToCount)
                .count();

        System.out.println("Original String: " + inputString);
        System.out.println("Character to Count: " + charToCount);
        System.out.println("Occurrences: " + occurrenceCount);

    }
}
