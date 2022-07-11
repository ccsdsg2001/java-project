package udp;

import org.junit.Test;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

/**
 * @author cc
 * @date 2022年07月11日 16:33
 */
public class UDPtest {
    @Test
    public void sender() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();



        String str="我是";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        InetAddress inetAddress = InetAddress.getLocalHost();
        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length);

        datagramSocket.send(datagramPacket);
        datagramSocket.close();

    }

    @Test
    public void recevier() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();

        byte[] buff=new byte[100];
        DatagramPacket datagramPacket = new DatagramPacket(buff,0,buff.length);
        datagramSocket.receive(datagramPacket);

        System.out.println(new String(datagramPacket.getData(),datagramPacket.getLength()));

        datagramSocket.close();


    }
}
