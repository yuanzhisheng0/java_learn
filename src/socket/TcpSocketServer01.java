package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TcpSocketServer01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();

        // 读stream
        InputStream inputStream = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int readlen = 0;
        while((readlen = inputStream.read(buffer)) != -1){
            System.out.println(new String(buffer,0,readlen));
        }

        // 写stream
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello client!".getBytes(StandardCharsets.UTF_8));
        // 设置结束标记
        socket.shutdownOutput();

        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();

    }
}
