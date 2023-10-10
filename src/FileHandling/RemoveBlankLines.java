package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class RemoveBlankLines {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source filename");
        String srcFile = sc.nextLine();
        Path src = Paths.get(srcFile);
//        System.out.println(src);
        BufferedReader br = Files.newBufferedReader(src);

        Path trg = Paths.get("C:\\Users\\Ravi\\Documents\\names4.txt");
        BufferedWriter bw = Files.newBufferedWriter(trg, StandardOpenOption.CREATE);
        while (true){
            String line = br.readLine();
            if(line == null)
                break;
            if(line.length()>0) { // This will check all lines including spaces,tabs also.
                bw.write(line);
                bw.write("\n");
            }
           // bw.write("\n");
        }
        bw.close();
        br.close();
        //Files.move(src,trg, StandardCopyOption.REPLACE_EXISTING);
        sc.close();
    }
}
