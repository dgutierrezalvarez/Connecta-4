package com.company.Connexio;


import com.company.Joc.Mesura;
import com.company.Joc.Tauler;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnexioClient extends Thread {
    Scanner scanner = new Scanner(System.in);
    Tauler t;
    String result;
    String nom;
    Mesura j = new Mesura();
    String hostname;
    boolean notFinished = true;
    int port;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ConnexioClient(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }

    public void run() {
        Tauler serverdata;
        Socket socket;
        ObjectOutputStream out;
        ObjectInputStream in;
        try {
            socket = new Socket(InetAddress.getByName(hostname), port);
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            while (notFinished) {
                System.out.println("--------------------------------");
                serverdata = (Tauler) in.readObject();
                t = serverdata;
                t.print();

                result = t.checkWinner(t);
                if (result.equals("haganado X")) {
                    System.out.println("Ganador X");
                    break;
                } else if (result.equals("haganado O")) {
                    System.out.println("Ganador 0");
                    break;
                }

                if (serverdata != null) {
                    System.out.println("Selecciona una columna");
                    j.setColumn(scanner.nextInt());
                    System.out.println("Selecciona una linea");
                    j.setRow(scanner.nextInt());

                    out.writeObject(t.mover(t, j));
                    out.flush();
                    t.print();
                    result = t.checkWinner(t);
                    if (result.equals("haganado X")) {
                        System.out.println("Ganador X");
                        break;
                    } else if (result.equals("haganado O")) {
                        System.out.println("Ganador 0");
                        break;
                    }
                }
            }
            close(socket);
        } catch (UnknownHostException ex) {
            System.out.println("Error de connexió. No existeix el host: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error de connexió indefinit: " + ex.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void close(Socket socket){
        try {
            if(socket!=null && !socket.isClosed()){
                if(!socket.isInputShutdown()){
                    socket.shutdownInput();
                }
                if(!socket.isOutputShutdown()){
                    socket.shutdownOutput();
                }
                socket.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(ConnexioClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        String ipSrv;
        int port;
        String jugador;
        //Demanem la ip del servidor i nom del jugador
        System.out.println("IP del servidor?");
        Scanner sip = new Scanner(System.in);
        ipSrv = sip.nextLine();
        System.out.println("Port?:");
        port = sip.nextInt();
        System.out.println("Nom jugador:");
        jugador = sip.next();
        ConnexioClient clientTcp = new ConnexioClient("localhost",5557);

        clientTcp.setNom(jugador);
        clientTcp.start();
    }
}