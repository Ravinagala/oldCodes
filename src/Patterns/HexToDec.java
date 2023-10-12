package Patterns;

public class HexToDec {
    public static void main(String[] args) {
        String hexdecimal = "1A";
        int decimal = Integer.parseInt(hexdecimal,16);
        System.out.println(hexdecimal);
        System.out.println(decimal);

        int decimal1 = 16;
        String hexdecimal1 = Integer.toHexString(decimal1);
        System.out.println(decimal1);
        System.out.println(hexdecimal1);
    }
}
