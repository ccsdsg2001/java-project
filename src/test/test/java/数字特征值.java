package test.test.java;

import java.util.Scanner;

public class 数字特征值 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int number;
        int W =1;
        int s_w;
        int s_z;
        int t=1;
        int sum=0;
        number = in.nextInt();
        while (0<number&& number<=1000000)
        {
            s_z = number%10%2;
            s_w = W%2;
            if (s_z ==s_w)
            {
                sum = sum +t;
            }
            W++;
            number=number/10;
            t =t*2;
        }
        System.out.println(sum);




    }
}
