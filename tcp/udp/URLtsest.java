package udp;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author cc
 * @date 2022年07月11日 16:48
 */
public class URLtsest {
    public static void main(String[] args) {
        URL url = new URL();
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getFile());
//        ...

//        URLConnection =(HttpURLConnection)url.openConnection();
//        URLConnection.connect();
//        URLConnection.getinputStream();
//        byte[] bu3=new byte[1024];
//        int len1;
//        while ((len1=inputStream.read(bu3))!=-1){
//            baos.write(bu3,0,len);
//        }
//    }
    }
}
