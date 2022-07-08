//-8import org.junit.Test;
//
//import java.io.*;
//
///**
// * @author cc
// * @date 2022年07月08日 13:04
// */
//public class InputStreamReader  {
//    @Test
//    public void test() throws IOException {
//        FileInputStream fileInputStream = new FileInputStream("hellp.txt");
//        InputStreamReader isr =new InputStreamReader(fileInputStream,"UTF-8");
//
//
//        char[] chars =new char[1024];
//        int len;
//        while ((len = isr.read())!=-1){
//
//        }
//    }
//
//    @Test
//    public void test1(){
//        File file=new File("hellp.txt");
//        File file1=new File("hellp.txt");
//
//        FileInputStream fis =new FileInputStream(file);
//        FileOutputStream fos=new FileOutputStream(file1);
//
//        InputStreamReader isr=new InputStreamReader(fis,"utf-8");
//        OutputStreamWriter osw=new OutputStreamWriter(fos,"gbk");
//
//        char[] chars = new char[1024];
//        int len;
//        while ((len = isr.read())!=-1){
//            osw.write(chars,0,len);
//        }
//        isr.close();
//        osw.close();
//    }
//
//}
