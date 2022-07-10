import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author cc
 * @date 2022年07月11日 0:04
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress byName = InetAddress.getByName("192.168.1.1");
            InetAddress byNa1me = InetAddress.getByName("www.baidu.com");
            InetAddress localHost = InetAddress.getLocalHost();

            System.out.println(localHost);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
