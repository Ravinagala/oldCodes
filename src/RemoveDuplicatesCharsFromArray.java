public class RemoveDuplicatesCharsFromArray {
    public static void main(String[] args) {
        String input = "He@llo World\t@";

       char[] chars = input.toCharArray();

       boolean[] seen = new boolean[256];
       System.out.println("Input string:\""+ input+ "\"");
       System.out.print("unique String:\"");
       for (int i = 0; i<chars.length;i++){
           char currentChar  = chars[i];
           if(!seen[currentChar]){
               seen[currentChar] = true;
               System.out.print(currentChar);
           }
       }
        System.out.print("\"");
    }
}


