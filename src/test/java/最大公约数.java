package test.java;

import java.util.Scanner;

public class 最大公约数 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b = in.nextInt();
        int gcd = 1;
        for (int i =2;i <=a && i<=b; i++)
        {
            if ( a%i ==0 && b%i ==0 )
            {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
//辗转相除法
//while (b!=0)
//        {
//            int r = a%b;
//            a=b;
//            b=r;
//        }
