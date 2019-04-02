package ch.juventus.sockets;

import ch.juventus.sockets.codeproject.Student;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Set;

public class PersonClient {

    public static void main(String[] args) {

        try (
            Socket client = new Socket("127.0.0.1", 8888);
            ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(client.getInputStream());
        ) {
            out.writeObject(new Request(Request.Command.ADD, new Person("Kevin", "Klein")));
            out.writeObject(new Request(Request.Command.ADD, new Person("Calvin", "Klein")));
            out.writeObject(new Request(Request.Command.ADD, new Person("Reiner", "Bienenhonig")));
            out.writeObject(new Request(Request.Command.ADD, new Person("Wilma", "Bier")));
            out.writeObject(new Request(Request.Command.ADD, new Person("Nochn", "Bier")));
            out.writeObject(new Request(Request.Command.ADD, new Person("Gibma", "Bier")));


            out.writeObject(new Request(Request.Command.GET_BY_NAME, "Bier"));
            Set<Person> persons = (Set) in.readObject();

            System.out.println(persons);


            out.writeObject(new Request(Request.Command.QUIT, null));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
