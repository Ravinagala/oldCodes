import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class RemoveBlankLinesMoveToAnotherLocation {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Source filename");
        String srcfile = sc.nextLine();
        Path src = Paths.get(srcfile);
        BufferedReader br = Files.newBufferedReader(src);

       Path trg = Paths.get("tempfile.txt");
        BufferedWriter bw = Files.newBufferedWriter(trg, StandardOpenOption.CREATE);
        while (true){
            String line = br.readLine();
            if(line == null)
                break;
            if(line.length()>0)
                bw.write(line + "\n");
        }
/*
        Path trg = Paths.get("tempfile.txt");
        BufferedWriter bw = Files.newBufferedWriter(trg, StandardOpenOption.CREATE);*/
        bw.close();
        br.close();
       // Files.move(src,trg, StandardCopyOption.REPLACE_EXISTING);
        sc.close();
    }
}
