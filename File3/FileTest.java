import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author cc
 * @date 2022年07月05日 22:15
 */
public class FileTest {
    @Test
    public void test(){
        File  file=new File("file.txt");//相当于当前module
//        File file1=new File();
    }
    @Test
    public void test2(){
        File file1=new File("heeo.txt");
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.getPath());
        System.out.println(file1.lastModified());
    }

    @Test
    public void test3(){
        File file=new File("D:\\BaiduNetdiskDownload");

        String[] list=file.list();
        for(String s:list){
            System.out.println(s);
        }
        File[] files= file.listFiles();
        for(File fil:files){
            System.out.println(fil);
        }
    }

    @Test
    public void test4() throws IOException {
        File file1=new File("123.txt");
        boolean b = file1.renameTo(file1);
        System.out.println(b);

        System.out.println(file1.isDirectory());
        System.out.println(file1.exists());
        if(!file1.exists()){
            file1.createNewFile();
            System.out.println();
        }else{
            file1.delete();
        }
        file1.mkdir();
        file1.mkdirs();
    }


}
