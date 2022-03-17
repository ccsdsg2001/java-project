package test.java;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int sum=0;
        double e = in.nextDouble();
        int n =1;
        boolean flag = true;
        loop: while (flag = true)
        {
            sum+=(Math.pow(-1,n+1) * (1/(2*n-1)));
            if (e>1/(2*n-1))
                break loop;
        }
        System.out.println(sum*4);
    }
}
