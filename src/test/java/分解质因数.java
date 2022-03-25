package test.java;

import java.util.Scanner;

public class 分解质因数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int s = 2;
        System.out.print(a+"=");
        do
        {
            if(a%s ==0)
            {
                a /=s;
                if(a!=1)
                {
                    System.out.print(s+"x");
                }
                else
                {
                    System.out.println(s);
                }
            }
            else
            {
                s ++;
            }

        }
        while (a !=1);
        {

        }

    }
}