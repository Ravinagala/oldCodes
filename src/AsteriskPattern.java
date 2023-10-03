
public class AsteriskPattern {
    public static void main(String[] args) {
        int numRows = 5; // Number of rows

        for (int i = 0; i < numRows; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  "); // Two spaces for each level
            }

            // Print asterisks
            for (int k = 0; k < numRows - i; k++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to the next line
        }
    }
}
