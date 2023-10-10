public class CharacterIndexFinder {
    public static void main(String[] args) {
        String inputString = "Hello World";
        char targetChar    = 'o';

        int firstIndex = inputString.lastIndexOf(targetChar);

        if(firstIndex != -1){
            System.out.println("The first index of  " + targetChar +  "in the string is  :" +  firstIndex);
        }else {
            System.out.println("'" + targetChar + "' not found in the string.");
        }
    }
}
