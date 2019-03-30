package ch.juventus.streams;

import java.io.*;

public class ByteStreams {

    public static void main(String[] args) {
        MyInputStream is = new MyInputStream();

        try (FileInputStream fis = new FileInputStream("pom.xml")) {
            int b;
            while ((b = fis.read()) != -1 ) {
                System.out.print((char)b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s = "Hello File";
        try (FileOutputStream fos = new FileOutputStream("data.dat")) {
            fos.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class MyInputStream extends InputStream {
        @Override
        public int read() throws IOException {
            return 0;
        }
    }

    private static class MyOutputStream extends OutputStream {

        @Override
        public void write(int b) throws IOException {

        }
    }
}
