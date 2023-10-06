import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a email address:");
        String input = sc.nextLine();
        String regex = "^[[a-z_.-]+|[\\d]]*@[\\w]+[.][a-z]+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if(matcher.matches()){
            System.out.println("Valid Email Address");
        }else
            System.out.println("Not a valid email address");


        if(matcher.matches()){
            String captured = matcher.group();
            String replaceAll = matcher.replaceAll("nagalaravi@gmail.com");
            System.out.println("Captured String:"+  captured);
            System.out.println("Replaced String:"+  replaceAll);
        }
    }
}
