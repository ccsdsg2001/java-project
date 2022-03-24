package test.java;

public class 求和函数 {
    public static void sum(int a,int b)
    {
        int i;
        int sum =0;
        for (i =a;i<=b;i++)
        {
            sum +=i;
        }
        System.out.println(sum);
    }
    public static void main(String [] args){
        sum(1, 10);
        sum(2, 20);
        sum(3, 30);
    }
}
