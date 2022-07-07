import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author cc
 * @date 2022年07月07日 15:59
 */
public class FileStreamTest {
        @Test
    public void fileinputStream(){
            FileInputStream fileInputStream= null;
            try {
                File file=new File("E:\\si\\File3\\hel3lp.txt");
                fileInputStream = new FileInputStream(file);
                byte[] buffer =new byte[5];
                int len;
                while ((len=fileInputStream.read(buffer))!=-1){
                    String str=new String(buffer,0,len);
                    System.out.println(str);

                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }

}
