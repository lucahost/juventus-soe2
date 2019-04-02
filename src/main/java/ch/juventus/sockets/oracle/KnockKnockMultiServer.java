package ch.juventus.sockets.oracle;

import java.io.IOException;
import java.net.ServerSocket;

public class KnockKnockMultiServer {

    public static void main(String[] args) {
        int portNumber = 3001;
        boolean listening = true;

        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            while (listening) {
                new KnockKnockMultiServerThread(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            System.err.println("Could not listen on port " + portNumber);
        }
    }
}
