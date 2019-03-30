package ch.juventus.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;

public class FileExample {
    public static void main(String[] args) {
        // inspect file
        File file = new File("pom.xml");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());

        // inspect directory
        File workDir = new File(".");
        System.out.println(workDir.getAbsolutePath());
        System.out.println(workDir.canWrite());
        Arrays.asList(workDir.listFiles()).forEach(System.out::println);

        // use in Writer
        try (PrintWriter fw = new PrintWriter(new File("foo.txt"))) {
            fw.println("Hello file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
