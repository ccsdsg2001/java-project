package test.test.java;

import java.util.Scanner;

public class 多项式加法 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int a,b;
        final int N =101;
        int[] arr = new int[N];
        int flag = 0;
        for (int i =0;i<arr.length;i++)
            arr[i] = 0;
        while (flag<2)
        {
            a =in.nextInt();
            b= in.nextInt();
            if ( a ==0)
                flag++;
            if(arr[a] !=0)
                arr[a] +=b;
            else
                arr[a] = b;
        }
        int begin = 0;
        for (int i = N-1;i>=0;i--)
        {
            if(arr[i]!=0)
            {
                begin =i;
                break;
            }
        }
        if(begin ==0)
        {
            System.out.print(arr[0]);
        }
        else
        {
            for (int i =begin; i>-1;i--)
            {
                if(arr[i] ==0)
                    continue;
                if(i==0)
                {
                    if(arr[0] >-1)
                    {
                        System.out.print("+"+arr[0]);
                    }
                    else
                    {
                        System.out.print(arr[0]);
                    }
                }
                else  if (i==begin)
                {
                    if(arr[i] ==1)
                    {
                        System.out.print("x"+i);
                    }
                    else if (arr[i] ==-1)
                    {
                        System.out.print("-x"+i);
                    }
                    else
                    {
                        System.out.print(arr[i]+"x"+i);
                    }
                }
                else if(i ==1 )
                {
                    if (arr[i] ==1)
                    {
                        System.out.print("+x");
                    }
                    else if (arr[i] ==-1)
                    {
                        System.out.print("-x");
                    }
                    else if (arr[i]>1)
                    {
                        System.out.print("+"+arr[i]+"x");
                    }
                    else
                    {
                        System.out.print(arr[i]+"x");
                    }
                }
                else if (i>1)
                {
                    if(arr[i] ==1)
                    {
                        System.out.print("+x"+i);
                    }
                    else if(arr[i] ==-1)
                    {
                        System.out.print("-x"+i);
                    }
                    else if(arr[i]>0)
                    {
                        System.out.print("+"+arr[i]+"x"+i);
                    }
                    else
                    {
                        System.out.print(arr[i]+"x"+i);
                    }
                }
            }
        }
    }
}
