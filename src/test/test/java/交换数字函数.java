package test.test.java;

public class 交换数字函数 {
    public static void  swap(int a,int b){
        int c;
        c =a;
        a = b;
        b =c;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args){
        swap(4, 5);


    }
}
