package sec02.kind_of_stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentEx {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("/Users/njkim/Workspace/intellij/this_is_java/ch16_스트림과병렬처리/src/sec02/kind_of_stream/linedata.txt");
    Stream<String> stream;


    stream = Files.lines(path, Charset.defaultCharset());
    stream.forEach(System.out::println);
    stream.close();
    System.out.println();

    File file = path.toFile();
    FileReader fileReader = new FileReader(file);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    stream = bufferedReader.lines();
    stream.forEach(System.out::println);
    stream.close();
  }
}
