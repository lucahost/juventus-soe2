package ch.juventus.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExercise {

    public static void main(String[] args) {
        workWithFiles();
        workWithNio2();
    }

    private static void workWithNio2() {
        try {
            // create empty file
            Files.createFile(Paths.get("target/empty.nio2.txt"));

            // create empty directory
            Files.createDirectory(Paths.get("target/emptyNioDir"));

            // create empty directories
            Files.createDirectories(Paths.get("target/emptyNioDir/a/b/c"));

            // copy file
            Files.copy(Paths.get("pom.xml"), Paths.get("pom.xml.save"));

            // delete file
            Files.delete(Paths.get("pom.xml.save"));

            // rename file
            Files.move(Paths.get("target/empty.nio2.txt"), Paths.get("target/empty.nio2.2.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void workWithFiles() {
        // create empty file
        File file = new File("target/empty.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // create empty directory
        File dir = new File("target/emtpyDir");
        dir.mkdir();
        // create directories
        File dirs = new File("target/a/b");
        dirs.mkdirs();
        // copy file (with streams)
        copyFileUsingStream(new File("pom.xml"), new File("pom.xml.save"));
        // delete file
        File delete = new File("pom.xml.save");
        delete.delete();
        // rename file
        File rename = new File("target/empty.txt");
        rename.renameTo(new File("target/empty2.txt"));
    }

    private static void copyFileUsingStream(File source, File dest) {
        try (InputStream is = new FileInputStream(source);
             OutputStream os = new FileOutputStream(dest)){
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
