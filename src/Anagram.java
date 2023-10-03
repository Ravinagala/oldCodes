import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean areAnagrams = areAnagrams(str1,str2);

        if(areAnagrams){
            System.out.println(str1 +  " and " +  str2 +  " are Anagrams");
        }else {
            System.out.println(str1 + "and" + str2 + "are not Anagrams");
        }
    }

    private static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str1.replaceAll("\\s","").toLowerCase();

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1,charArray2);



    }
}
