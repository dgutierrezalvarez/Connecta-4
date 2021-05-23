package com.company.Connexio;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnexioServidor {
    int port;

    public ConnexioServidor(int port ) {
        this.port = port;
    }

    public void listen() {
        ServerSocket serverSocket;
        Socket clientSocket1;
        Socket clientSocket2 = null;

        try {
            serverSocket = new ServerSocket(port);
            while(true) {
                clientSocket1 = serverSocket.accept();

                if (clientSocket1 != null) {
                    clientSocket2 = serverSocket.accept();
                }

                if (clientSocket1 != null && clientSocket2 != null) {
                    ConnexioThreadServidor threadServer = new ConnexioThreadServidor(clientSocket1, clientSocket2);
                    Thread thread = new Thread(threadServer);
                    thread.start();
                }
                System.out.println("Socket 1 => " + clientSocket1);
                System.out.println("Socket 2 => " + clientSocket2);
            }
        } catch (IOException ex) {
            Logger.getLogger(ConnexioServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        ConnexioServidor srv = new ConnexioServidor(5557);
        srv.listen();
    }
}