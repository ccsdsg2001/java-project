package test.java;

import java.util.Scanner;

public class 素数数组方法2 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        boolean[] isprime = new boolean[100];
        for (int i =0;i<isprime.length;i++)
        {
            isprime[i] = true;
        }
        for (int i =2;i<isprime.length;i++)
        {
            if (isprime[i])
            {
                for (int k =2;i*k <isprime.length;k++)
                {

                    isprime[i*k] =false;
                }
            }
        }
        for (int i =2;i<isprime.length;i++)
        {
            if(isprime[i])
            {
                System.out.print(i+" ");
            }
        }
    }
}
