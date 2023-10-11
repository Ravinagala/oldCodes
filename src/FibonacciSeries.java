import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print fibonacci series:");
        int n = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        int sum = 0;

        for(int i = 0; i < n; i++){
            System.out.print(firstTerm + " ");
            sum += firstTerm;
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println("\nSum of the first " + n + " Fibonacci numbers is: " + sum);
    }
}
