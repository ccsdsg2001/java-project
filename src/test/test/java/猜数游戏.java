package test.test.java;

import java.util.Scanner;

public class 猜数游戏 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int number = (int) (Math.random()*100+1);
        int a;
        int count = 0;
        do {
            a = in.nextInt();
            count = count +1;
            if (a > number)
            {
                System.out.println("big");
            }
            else if (a < number)
            {
                System.out.println("small");
            }
        } while ( a != number);
        System.out.println(count);


    }
}
