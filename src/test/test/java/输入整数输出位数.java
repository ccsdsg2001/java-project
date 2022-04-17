package test.test.java;

import java.util.Scanner;

public class 输入整数输出位数 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 0;
        do
        {
            number = number /10;
            count = count + 1;
        }         while ( number > 0);
        System.out.println(count);
    }
}
