package test.java;

public class 逻辑与或非测试 {
    public static void main(String[] args){
        int a =2;
        int b = 5;
        boolean result = ((a>b)&&(a!=b));
        boolean result2 = ((a<b || (a!=b)));
        System.out.println(result);
        System.out.println(result2);
    }

}
