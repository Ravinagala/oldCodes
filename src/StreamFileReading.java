import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class StreamFileReading {
    public static void main(String[] args) throws IOException {
        var lines = Files.lines(Paths.get("/home/developer/Documents/marks.txt"));
       System.out.println(lines.collect(Collectors.toList()));
//        lines.sorted().forEach(System.out::println);
//     lines.close();
    }
}
