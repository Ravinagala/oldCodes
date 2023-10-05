public class MaxAndMinElement {
    public static void main(String[] args) {
        String input = "HelloSteve";

        if(input.isEmpty()){
            System.out.println("The string is empty");
            return;
        }

        char maxChar = input.chars()
                .mapToObj(c -> (char)c)
                .max(Character::compareTo)
                .get();


        char minChar = input.chars()
                .mapToObj(c -> (char) c)
                .min(Character::compareTo)
                .get();


        System.out.println(input);
        System.out.println(maxChar);
        System.out.println(minChar);
    }
}
