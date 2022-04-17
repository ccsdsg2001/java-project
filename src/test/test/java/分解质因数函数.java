package test.test.java;

import java.util.Scanner;
public class 分解质因数函数 {
    static void split(int n){

        int count = 0;
        int a[] = new int[n];
        for(int i=2; i<=n;i++)
        {
            boolean isPrime = true;
            for(int j=2;j<=i;j++)
            {
                if(i%j == 0 && i!=j)
                    isPrime = false;
            }
            if(isPrime)
            {

                a[count] = i;
                count++;
            }
        }
        System.out.print(n+"=");
        for(int i=0;i<n;i++)
        {
            while(n%a[i]== 0)
            {
                n=n/a[i];
                if(n==1)
                {
                    System.out.print(a[i]);
                }
                else{
                    System.out.print(a[i]+"x");
                }

            }
            if(n==1)
                break;
        }

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int he = in.nextInt();
        split(he);
    }

}