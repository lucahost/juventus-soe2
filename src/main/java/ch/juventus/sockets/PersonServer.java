package ch.juventus.sockets;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PersonServer {

    public static void main(String[] args) {
        PersonStore ps = new PersonStore();
        try (
            ServerSocket server = new ServerSocket(8888);
            Socket client = server.accept(); // blocking wait!
            ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(client.getInputStream());
        ) {
            Request request = (Request) in.readObject();
            while (!Request.Command.QUIT.equals(request.getCommand())) {
                switch (request.getCommand()) {
                    case ADD: ps.addPerson(request.getPerson());break;
                    case REMOVE: ps.removePerson(request.getPerson()); break;
                    case GET_BY_NAME:
                        out.writeObject(ps.getPersonsByLastName(request.getLastName()));
                        break;
                    default:
                        System.out.printf("Unknown command %s", request.getCommand());
                }
                request = (Request) in.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
