package test.test.java;

import java.util.Scanner;

public class 前50个素数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] prims = new int[50];
        prims[0] = 2;
        int cnt = 1;
        wp:
        for (int x = 3; cnt < 50; x++)
        {
            for(int i =0;i<cnt;i++)
            {
                if(x%prims[i] == 0)
                {
                    continue wp;
                }
            }
            prims[cnt++] = x;
        }
        for(int k:prims)
        {
            System.out.println(k+" ");
        }
    }
}
