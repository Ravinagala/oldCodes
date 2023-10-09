package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileContainsString {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name");
        String srcfile = sc.nextLine();
        String source_string = "Ravi";


        try(BufferedReader br = new BufferedReader(new FileReader(srcfile))){
            String line;
            while ((line = br.readLine())!=null){
                if(line.contains(source_string)){
                    System.out.println(line);
                }

            }
        }catch (IOException ioException){
            ioException.printStackTrace();
        }

    }
}
