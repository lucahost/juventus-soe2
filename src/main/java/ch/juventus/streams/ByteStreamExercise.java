package ch.juventus.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExercise {

    public static void main(String[] args) {
        copy("pom.xml", "pom.xml.copy");
    }

    static void copy(String from, String to) {
        try (FileInputStream fis = new FileInputStream(from)) {

            try (FileOutputStream fos = new FileOutputStream(to)) {
                int b;
                while ((b = fis.read()) != -1) {
                    fos.write(b);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
