package test.java;

import java.util.Scanner;

public class 整数分解 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int number;
        number = in.nextInt();
        int result = 0;
        do
        {
            int digit = number%10;
            result = result* 10+digit;
            System.out.println(digit);
            number = number/10;
        } while (number>0);
        System.out.println();
        System.out.println(result);
    }


}
