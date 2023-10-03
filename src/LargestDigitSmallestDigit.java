import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargestDigitSmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        long number = sc.nextLong();

        List<Integer> digits = getDigits(number);

        if(digits.isEmpty()){
            System.out.println("No digits found in the number");
        }else{
            int largestDigit = Collections.max(digits);
            int smallestDigit = Collections.min(digits);

            System.out.println("The largest digit:"+largestDigit);
            System.out.println("The smallest digit:"+smallestDigit);
        }

    }

    private static List<Integer> getDigits(long number) {
        List<Integer> digits = new ArrayList<>();
        while (number > 0){
            int digit = (int) (number % 10);
            digits.add(digit);
            number = number / 10;
        }
        Collections.reverse(digits);
        return digits;
    }
}
