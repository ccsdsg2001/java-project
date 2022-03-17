package test.java;

import java.util.Scanner;

public class 求平均数 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        do {
            number = in.nextInt();
            if (number != -1)
            {
                sum = sum + number;
                count = count + 1;
            }
        } while (number != -1);
        if (count > 0)
        {
            System.out.println("average"+(double)sum/count);
        }

    }
}
