package ch.juventus.streams;

import java.io.*;

public class CharacterStreamExercise {

    public static void main(String[] args) {
        copy("pom.xml", "pom.xml.save");
    }

    static void copy(String from, String to) {
        try (BufferedReader reader = new BufferedReader(new FileReader(from))) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(to))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
