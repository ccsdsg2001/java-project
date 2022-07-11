import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author cc
 * @date 2022年07月11日 16:15
 */
public class Tcptest2 {
    @Test
    public void client() throws IOException{
        Socket socket=new Socket("127.0.0.1",9090);
        OutputStream outputStream = socket.getOutputStream();
        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\12.jpg"));
        byte[] bu=new byte[1024];
        int len;
        while ((len = fileInputStream.read(bu))!=-1){
            outputStream.write(bu,0,len);
        }
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        byte[] bu3=new byte[1024];
        int len1;
        while ((len1=inputStream.read(bu3))!=-1){
            baos.write(bu3,0,len);
        }
        System.out.println(baos.toString());

        fileInputStream.close();
        outputStream.close();
        socket.close();
        baos.close();
        inputStream.close();
    }

    @Test
    public void server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(9090);

        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream(new File("1.jpg"));

        byte[] bytes = new byte[1024];
        int len;
        while ((len=inputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,len);
        }
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("收到".getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();

    }
}
