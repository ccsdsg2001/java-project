import org.junit.Test;

import java.io.*;

/**
 * @author cc
 * @date 2022年07月09日 17:01
 */
public class ObjectInputOutputStreamTest {
//    序列化过程：将内存中的java对象保存到磁盘中或通过网络传输进去,使用ObjectOutPutStream实现
    @Test
    public void TestObjcetStream(){
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("hellp.txt"));

            oos.writeObject(new String("你好"));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


//    反序列化：将自盘文件中的对象还原为内存中的一个java对象，使用ObjectInputStream实现
    @Test
    public void testObjectInputStream(){
        ObjectInputStream ois= null;
        try {
            ois = new ObjectInputStream(new FileInputStream("hellp.txt"));
            Object obj =ois.readObject();
            String str=(String) obj;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
