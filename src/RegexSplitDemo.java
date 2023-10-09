import java.util.regex.Pattern;

public class RegexSplitDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z]+");
        String[] items = p.split("one1two2three3");
        for(String s : items){
            System.out.println(s);
        }
    }
}
