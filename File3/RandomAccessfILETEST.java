import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/**
 * @author cc
 * @date 2022年07月10日 0:05
 */
public class RandomAccessfILETEST {
    @Test
    public void TEST() throws IOException {
        RandomAccessFile raf1=new RandomAccessFile("hellp.txt","r");
        RandomAccessFile raf2=new RandomAccessFile("hellp2.txt", "rw");

        byte[] buff=new byte[1024];
        int len;
        while ((len =raf1.read(buff))!=-1){
            raf2.write(buff,0,len);
        }

        raf1.close();
        raf2.close();
    }

    @Test
    public void test2() throws IOException{
        RandomAccessFile raf1=new RandomAccessFile("hellp.txt","rw");
        raf1.seek(3);//将指针调到角标为3的位置
        raf1.write("xyz".getBytes(StandardCharsets.UTF_8));

        raf1.close();
    }

//    使用RandomAccessFile实现数据的插入效果
//    @Test
//    public void test3() throws IOException{
//        RandomAccessFile raf1=new RandomAccessFile("hellp.txt","rw");
//        raf1.seek(3);//将指针调到角标为3的位置
//        StringBuilder builder=new StringBuilder((int) new File("hellp.txt"));
//        byte[] buffer=new byte[20];
//        int len;
//        while ((len =raf1.read(buffer))!=-1){
//            builder.append(new String(buffer,0,len));
//        }
//
//        raf1.seek(3);
//        raf1.write("xyz".getBytes(StandardCharsets.UTF_8));
//        raf1.write(builder.toString().getBytes(StandardCharsets.UTF_8));
//        raf1.close();
//    }
}
