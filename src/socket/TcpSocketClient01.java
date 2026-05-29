package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpSocketClient01 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);

        // 写stream
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello server!".getBytes());
        socket.shutdownOutput();

        // 读stream
        InputStream inputStream = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int readlen = 0;
        while((readlen = inputStream.read(buffer)) != -1){
            System.out.println(new String(buffer,0,readlen));
        }

        outputStream.close();
        inputStream.close();
        socket.close();
    }
}
