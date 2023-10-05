public class RemoveDuplicatesCharsFromArray {
    public static void main(String[] args) {
        String input = "He@llo World @";

        char[] chars = input.toCharArray();

        boolean[] seen = new boolean[256];

        int uniqueIndex = 0;

        for(int i = 0; i < chars.length; i++){
            char currentChar = chars[i];

            if(!seen[currentChar]){
                chars[uniqueIndex++] = currentChar;
                seen[currentChar] = true;
            }
        }


        String uniqueString = new String(chars, 0, uniqueIndex);
        System.out.println("Original String: " + input);
        System.out.println("String with Duplicate Characters Removed: " +uniqueString);


    }
}
