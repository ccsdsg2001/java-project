import org.junit.Test;

import java.io.*;

/**
 * @author cc
 * @date 2022年07月07日 21:22
 */
public class BufferIOTest {
    @Test
    public void BufferedStreamTest(){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream= null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream= null;
        try {
            File srcFile =new File("C:\\Users\\Administrator\\Desktop\\12.jpg");
            File destFile =new File("C:\\Users\\Administrator\\Desktop\\123.jpg");

            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(destFile);

            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte[] buffer=new byte[1024];
            int len;
            while ((len=bufferedInputStream.read())!=-1){
                bufferedOutputStream.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void BufferReaderAndBufferWriterTest(){
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File()));
            bufferedWriter = new BufferedWriter(new FileReader(new File()));

            char[] cr=new char[1024];
            int len;
            while ((len =bufferedReader.read())!=-1){
                bufferedWriter.write(cr,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
