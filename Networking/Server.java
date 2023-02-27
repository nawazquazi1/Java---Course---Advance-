package Networking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

// TCp
public class Server {
    public static void main(String[] args) {
        try {
            while (true) {
                System.out.println(" Waiting for client ");
                ServerSocket serverSocket = new ServerSocket(2222);
                Socket socket = serverSocket.accept();
                System.out.println("client connected");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String str = bufferedReader.readLine();
                if (str.equals("/quit")) {
                    System.out.println("EXIT !!!!! ##");
                    break;
                }
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                out.println("server : " + str);
            }
        } catch (IOException e) {

        }

    }


}
