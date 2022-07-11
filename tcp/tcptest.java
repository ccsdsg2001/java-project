import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author cc
 * @date 2022年07月11日 15:58
 */
public class tcptest {

    @Test
    public void client()  {
        Socket socket= null;
        OutputStream outputStream = null;
        try {
            InetAddress inet=InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet,8899);

            outputStream = socket.getOutputStream();
            outputStream.write("你好".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    @Test
    public void server()  {
        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream outputStream = null;
        ByteArrayOutputStream baos= null;
        try {
            serverSocket = new ServerSocket(8899);
            accept = serverSocket.accept();
            outputStream = accept.getInputStream();
//        byte[] bytes=new byte[1024];
//        int len;
//        while ((len = outputStream.read()  ))
            baos = new ByteArrayOutputStream();
            byte[] b=new byte[5];
            int len;
            while((len=outputStream.read(b))!= -1){
                baos.write(b,0,len);
            }

            System.out.println(baos.toString());
            System.out.println(accept.getInetAddress());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(baos!=null){
                    baos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                accept.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }










    }
}
