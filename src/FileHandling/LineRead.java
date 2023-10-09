package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LineRead {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name:");
        String srcFile = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(srcFile))){
            String line;
            while ((line = br.readLine())!=null){
               System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
