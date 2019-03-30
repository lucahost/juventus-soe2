package ch.juventus.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
// file
Path file = Paths.get("pom.xml");
System.out.println(Files.exists(file));
System.out.println(file.toAbsolutePath());

// directories
Path workDir = Paths.get(".");
System.out.println(workDir.toAbsolutePath());
System.out.println(Files.isWritable(workDir));
try {
    Files.list(workDir).forEach(System.out::println);
} catch (IOException e) {
    e.printStackTrace();
}

// use in Writer
try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get("foo.txt")))){
    writer.println("Hello file.");
} catch(IOException ex){
    ex.printStackTrace();
}
    }
}
