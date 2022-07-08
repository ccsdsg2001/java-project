import org.junit.Test;

import javax.xml.crypto.Data;
import java.io.*;

/**
 * @author cc
 * @date 2022年07月08日 13:44
 */
public class OtherStreamTest {
    @Test
    public void test(){
        InputStreamReader isr=new InputStreamReader();
        BufferedReader BF=new BufferedReader();

        while(true){
            String data=BF.readLine();
            if(data.equalsIgnoreCase("e")){
                break;
            }
        }

    }

    @Test
    public void ma(){
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("hellp.txt"));
        dataOutputStream.writeInt(23);
        dataOutputStream.writeBoolean(true);
        dataOutputStream.writeUTF("你好");
        dataOutputStream.close();
        DataInputStream dataInputStream=new DataInputStream(new FileInputStream())
    }
}
