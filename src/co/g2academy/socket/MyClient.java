package co.g2academy.socket;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6666);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF("Hello server, its me MyClient");
            out.flush();
            out.close();
            socket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
