public class MaxAndMinAscii {
    public static void main(String[] args) {
        String input = "HELLO\nravi";

        if(input.isEmpty()){
            System.out.println("The String is empty");
            return;
        }

        int maxascii = input.chars()
                .max().getAsInt();

        int minascii = input.chars()
                .min().getAsInt();


        char maxchar = (char) maxascii;
        char minchar = (char) minascii;

        System.out.println("The input string is:"+input);
        System.out.println("The maxascii is:"+ maxascii + " and" + " The maxchar is:"+ maxchar);
        System.out.println("The minascii is:"+ minascii + " and" + " The minchar is:"+ minchar);

    }
}
