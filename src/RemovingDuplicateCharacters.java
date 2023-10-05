import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemovingDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = sc.nextLine();

        String uniqueCharacters = word.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("Original word:"+word);
        System.out.println("Word after removing elemets:"+uniqueCharacters);



    }

}
