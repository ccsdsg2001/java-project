package test.java;

import java.util.Scanner;

public class 素数求和函数 {
    public static boolean  isprime(int i)
    {
        boolean isprime = true;
        for (int k=2;k<i; k++)
        {
            if(i % k==0)
            {
                isprime =false;
                break;
            }
        }
        return isprime;
    }

    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int m =in.nextInt();
        int n = in.nextInt();
        if(m ==1) m=2;
        int cnt =0;
        int sum =0;
        for(int i =m;i<=n;i++)
        {
            if (isprime(i)) {
                cnt++;
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
