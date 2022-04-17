package test.test.java;

import java.io.*;

public class iostream {
    public static void main(String[] args){
         byte[] byt = new byte[10];
        for (int i =0 ;i<byt.length;i++){
            byt[i] =(byte) i;
        }
            try {
                DataOutputStream fi =new DataOutputStream(new BufferedOutputStream(new FileOutputStream("a.txt")));
                PrintWriter out =new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test.txt"))));
                BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\si\\stu.java")));
                String line;
                while ((line =input.readLine()) != null){
                    System.out.println(line);
                }
                int te = 2324;
                out.println(te);
                out.close();
                int i = 0xcafebebe;
                fi.writeInt(i);
                fi.close();
                DataInputStream in =new DataInputStream(new BufferedInputStream(new FileInputStream("a.txt")));
                int j =in.readInt();
                System.out.println(j);
//                FileOutputStream file=new FileOutputStream("a.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }


//        System.out.println("hello");
//        byte[] buffer =new byte[1024];
//        try {
//            int len =System.in.read(buffer);
//            String s =new String(buffer,0,len);
//            System.out.println("read"+len);
//            System.out.println(s.toString());
//            System.out.println(s.length());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
