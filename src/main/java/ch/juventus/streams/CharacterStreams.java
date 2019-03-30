package ch.juventus.streams;

import java.io.*;
import java.nio.charset.Charset;

public class CharacterStreams {

    public static void main(String[] args)  {

        System.out.println(Charset.defaultCharset());

        try (BufferedReader reader = new BufferedReader(new FileReader("pom.xml"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

try (PrintWriter writer = new PrintWriter(new FileWriter("text.txt"))) {
    writer.println("Hello File");
} catch (IOException e) {
    e.printStackTrace();
}

    }



    private static class MyReader extends Reader {

        @Override
        public int read(char[] cbuf, int off, int len) throws IOException {
            return 0;
        }

        @Override
        public void close() throws IOException {

        }
    }


}
