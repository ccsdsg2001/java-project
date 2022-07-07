import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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


        @Test
    public void fileStreamTest() {
            FileInputStream fileInputStream = null;
            FileOutputStream fileOutputStream = null;
            try {
                File file = new File("C:\\Users\\Administrator\\Desktop\\12.jpg");
                File file1 = new File("C:\\Users\\Administrator\\Desktop\\123.jpg");

                fileInputStream = new FileInputStream(file);
                fileOutputStream = new FileOutputStream(file1);

                byte[] buffer = new byte[5];
                int len;
                while ((len = fileInputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
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

            public void copyfile(String file2,String file21){
                FileInputStream fileInputStream= null;
                FileOutputStream fileOutputStream= null;
                try {
                    File file=new File(file2);
                    File file1=new File(file21);

                    fileInputStream = new FileInputStream(file);
                    fileOutputStream = new FileOutputStream(file1);

                    byte[] buffer=new byte[5];
                    int len;
                    while ((len = fileInputStream.read(buffer))!=-1){
                        fileOutputStream.write(buffer,0,len);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
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
        }



