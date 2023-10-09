package FileHandling;

import java.io.*;
import java.util.Scanner;

public class NonBlankLines {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name:");
        String srcFile = sc.nextLine();

        System.out.println("Enter target file name:");
        String trgFile = sc.nextLine();


        try(LineNumberReader lr = new LineNumberReader(new FileReader(srcFile));

        FileWriter fw = new FileWriter(trgFile)){
            String line;
            while ((line = lr.readLine())!=null){

                if(!line.trim().isEmpty()){
                    fw.write(line.toLowerCase() + "\n");
                }

            }

        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
