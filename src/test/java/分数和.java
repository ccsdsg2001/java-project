package test.java;

import java.util.Scanner;

public class 分数和 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0.0;
//        int sign = 1;
        for (int i =1;i<=n;i++)
        {
            sum += 1.0/i;
//            sign = -sign; 分数正负和
        }
        System.out.println(sum);
    }
}
