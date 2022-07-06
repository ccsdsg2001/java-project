import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author cc
 * @date 2022年07月06日 21:10
 */
public class IOtest {

//    将文件内容读入程序中,输出到控制台
    @Test
    public void testFileReaderTest() throws IOException {
        File file=new File("E:\\si\\File3\\hellp.txt");
//        2.提供具体的流
        FileReader fileReader = new FileReader(file);
        fileReader.read();

//        3.数据的读入 read():返回读入的一个字符,如果到达末尾,返回-1
        int data=fileReader.read();
        while (data!=-1){
            System.out.println((char)data);
            data=fileReader.read();
        }

//        4.流的关闭
        fileReader.close();

    }

    @Test
    public void testFileReadde()  {
        File file=new File("E:\\si\\File3\\hellp.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            char[] cb=new char[5];
            int len;
            while((len=fileReader.read(cb))!=-1){
                for(int i=0;i<len;i++){
                    System.out.println(cb[i]);
                }

            };
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        read(char[] xx):返回每次读入数组中的字符的个数,如果达到文件末尾,返回-1


    }
}
