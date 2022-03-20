package test.java;

import java.util.Scanner;

public class 数组性质 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int[] a ={1,2,3,4,5};
        int[] b = new int[a.length];
        for (int i =0;i<b.length;i++)
        {
            b[i] = a[i];
        }
        for (int i = 0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
        System.out.println(a==b);

    }
}
