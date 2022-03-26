package test.java;

import java.util.Scanner;

public class 完数函数 {
    public static void spilt(int n,int m){
        int t =0;
        for (; n<=m ; n++)
        {
            int sum = 0;
            for (int i =1;i<n;i++)
            {
                if(n%i == 0)
                {
                    sum += i;
                }
            }
            if(sum ==n && t ==0)
            {
                System.out.println(n);
                t++;
            }
            else if (sum == n && t != 0)
                System.out.println(" "+n);
            else
                continue;
        }
        if (t ==0)
            System.out.println();
    }





    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int num =in.nextInt();
        int number =in.nextInt();
        spilt(num, number);

    }
}
