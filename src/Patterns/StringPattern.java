package Patterns;

public class StringPattern {
    public static void main(String[] args) {
        String input = "ravi";
        int textLength = input.length();

        for(int i = 1; i <= textLength; i++){
            String substring = input.substring(0,i);
            System.out.println(substring);

        }
    }
}
