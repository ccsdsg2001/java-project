import org.junit.Test;

import java.io.*;

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

    @Test
    public void test() {
        FileWriter fileWriter= null;
        try {
            File file=new File("E:\\si\\File3\\hel3lp.txt");

//        2.提供fileWriter的对象，将用于数据写出
            fileWriter = new FileWriter(file);
            fileWriter.write("i va\n");
            fileWriter.write("1321");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileWriter!=null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    @Test
    public void fileiotest() {
        FileReader fileReader= null;
        FileWriter fileWriter= null;
        try {
            File file=new File("E:\\si\\File3\\hel3lp.txt");
            File file1=new File("E:\\si\\File3\\hellp.txt");

            fileReader = new FileReader(file);
            fileWriter = new FileWriter(file1);

            char[] chars = new char[5];
            int len;
            while ((len=fileReader.read(chars))!=-1) {
                    fileWriter.write(chars,0,len);
                }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        }

    }


