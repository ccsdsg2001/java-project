package test.java;

import java.util.Scanner;

public class 查找数组某个数 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int[] test ={1,2,4,56,742,54,23,11};
        int number = in.nextInt();
        boolean found = false;
        for (int k:test)
        {
            if (number ==k)
            {
                found =true;
                break;
            }
        }
        if (found)
        {
            System.out.println(number+"其中");
        }
        else
        {
            System.out.println(number+"不在其中");
        }
//        int loc = -1;
//        for (int i =0;i < test.length;i++)
//        {
//            if (number == test[i])
//            {
//                loc = i;
//                break;
//            }
//        }
//        if (loc >-1)
//        {
//            System.out.println(number+"是第"+(loc +1)+"个");
//        }
//        else
//        {
//            System.out.println(number+不在其中);
//        }

    }
}
