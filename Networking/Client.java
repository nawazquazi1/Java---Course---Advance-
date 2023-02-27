package Networking;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            while (true) {
                System.out.println("Client started");
                Socket socket = new Socket("LocalHost", 2222);
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter the message ");
                String mess = reader.readLine();
                if (mess.equals("/quit")){
                    System.out.println("EXIT !!!!! ##");
                    break;
                }
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                out.println(mess);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println(bufferedReader.readLine());
            }
        } catch (IOException u) {

        }

    }
}
