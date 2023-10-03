import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class IOStreams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file :");
        String srcfile = sc.nextLine();
        System.out.println("Enter target file:");
        String trgfile = sc.nextLine();

        try(FileReader fr = new FileReader(srcfile);
            FileWriter fw = new FileWriter(trgfile)){
            BufferedReader br = new BufferedReader(fr);
            String line;
            while (true){
                line = br.readLine();
                if(line == null){
                    break;
                }fw.write(line.toUpperCase() + "\n");
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
