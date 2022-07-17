import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author cc
 * @date 2022年07月17日 13:58
 */
//消费性接口 Comsumer<T> void accept(T t)
//供给型接口 Supplier<T> T get()
//函数型接口 Function<T,R> R apply(T t)
//断定型接口 Predicate<T> boolean test(T t)
public class Lambdatest2 {
    @Test
    public void test1(){
        happttime(230, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println(aDouble);
            }
        });

        happttime(2,money-> System.out.println(money));
    }
    public void happttime(double money, Consumer<Double> con){
        con.accept(money);
    }


    @Test
    public void test2(){
        List<String> list = Arrays.asList("北京","南京","天津","东京","西京","普京");

        List<String> filterStrs = filterString(list,
                new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.contains("京");
                    }
                });

        System.out.println(filterStrs);


        List<String> filterStrs1 = filterString(list,s -> s.contains("京"));
        System.out.println(filterStrs1);
    }

    //根据给定的规则，过滤集合中的字符串。此规则由Predicate的方法决定
    public List<String> filterString(List<String> list, Predicate<String> pre){

        ArrayList<String> filterList = new ArrayList<>();

        for(String s : list){
            if(pre.test(s)){
                filterList.add(s);
            }
        }

        return filterList;
}
