package test.java;

import java.util.Scanner;

public class 单词长度 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String s;
        s = in.nextLine();
        int len = 0;
        if(s.equals("."))
        {
        }
        else
        {
            for (int i =0;i<s.length();i++)
            {
                if(s.charAt(i) ==' ' && len == 0)
                {

                }
                else if(s.charAt(i) == ' ')
                {
                    System.out.println(len + " ");
                    len = 0;
                }
                else if(s.charAt(i) == '.' && len != 0)
                {
                    System.out.println(len);
                }
                else
                {
                    len++;
                }
            }
        }
    }
}
