package ch.juventus.sockets.codeproject;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class StudentClient {

    public static void main(String[] args) {

        try (
            Socket client = new Socket("127.0.0.1", 8888);
            ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
        ){

            Student student = new Student("John", 4.5);
            out.writeObject(student);
            out.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
