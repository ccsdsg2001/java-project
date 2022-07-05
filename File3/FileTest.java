import org.junit.Test;

import java.io.File;

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

    public void test2(){
        File file1=new File("heeo.txt");
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.getPath());
        System.out.println(file1.lastModified());

    }
}
