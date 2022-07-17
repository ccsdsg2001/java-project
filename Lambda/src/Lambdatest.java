import org.junit.Test;

import java.util.Comparator;

/**
 * @author cc
 * @date 2022年07月17日 13:12
 */



public class Lambdatest {
    @Test
    public void test1(){
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("da");
            }
        };
        r1.run();

        Runnable r2=()-> System.out.println("d");
        r2.run();
    }

    @Test
    public void test2(){
        Comparator<Integer> com1=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };
        int com=com1.compare(12,3);
        System.out.println(com);
//        Lamabda的写法
        Comparator<Integer> com2=( o3,o2) -> Integer.compare(o3,o2);
//        方法引用
        Comparator<Integer> com3=Integer ::compare ;
    }


}
