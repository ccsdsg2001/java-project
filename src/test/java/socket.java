package test.java;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class student{
    private String name;
    private int age;
    private int grade;

    public student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String nian(){
        return name.toString();
    }
}
public class socket {
    public static void main(String[] args){
        try {
            student s1 =new student("cc", 1, 2);
            System.out.println(s1);
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("obj.dat"));
            out.writeObject(s1);
            out.close();
            ObjectOutputStream in =new ObjectOutputStream(new FileOutputStream("obj.dat"));
            System.out.println(s1);
//            Socket socket =new Socket(InetAddress.getByName(null);
//            PrintWriter out =new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
//            out.println("hellp");
//            out.flush();
//            BufferedReader in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            String line;
//            line =in.readLine();
//            System.out.println(line);
//            out.println();
//            socket.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
