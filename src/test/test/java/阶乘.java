package test.test.java;

import java.util.Scanner;

public class 阶乘 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();


        int factor = 1;
        for (int i=1;i<=n;i=i+1)
        {
            factor =factor*i;
        }
//        while (i<n)
//        {
//            factor = factor * i;
//            i = i+1;
//        }
        System.out.println(factor);
    }

}

