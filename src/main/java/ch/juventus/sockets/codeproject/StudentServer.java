package ch.juventus.sockets.codeproject;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class StudentServer {

    public static void main(String[] args) {

try (
    ServerSocket server = new ServerSocket(8888);
    Socket client = server.accept(); // blocking wait!
    ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
    ObjectInputStream in = new ObjectInputStream(client.getInputStream());
) {

    Student student = (Student) in.readObject();
    System.out.printf("Average: %.2f, Name: %s\n", student.getAverage(), student.getName());


} catch (IOException | ClassNotFoundException e) {
    e.printStackTrace();
}

    }
}
