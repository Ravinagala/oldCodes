
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for Pascal Triangle:");
        int numRows = scanner.nextInt();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numRows - i; j++) {
                System.out.print("   "); // Add spaces for formatting
            }

            int currentValue = 1;
            for (int k = 0; k <= i; k++) {
                System.out.printf("%6d", currentValue);
                currentValue = currentValue * (i - k) / (k + 1);
            }

            System.out.println();
        }

        scanner.close();
    }



}



