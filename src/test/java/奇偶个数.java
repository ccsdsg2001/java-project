package test.java;

import java.util.Scanner;

public class 奇偶个数 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int a = 0, b = 0;
        int c;
        do {
            c = in.nextInt();
            if (c % 2 == 0)
            {
                a = a + 1;
            }
            else
            {
                b = b+ 1 ;
            }
        } while (c != -1);
        System.out.println(b-1+" "+a);
    }
}





