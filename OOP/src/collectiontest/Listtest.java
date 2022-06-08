package collectiontest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cc
 * @date 2022年06月06日 23:05
 */
public class Listtest {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(213);
        list.add("AA");
    //void add(int index,Object ele):在index位置插入ele元素
        list.add(1,"dd");

        List<Integer> integers = Arrays.asList(1, 2, 3);
        //boolean addAll(int index,object ele):从index位置开始将eles中所有元素添加进来
        list.addAll(integers);
        System.out.println(list);
        //get获取所在位置的元素
        System.out.println(list.get(0));

        //int indexof(Object obj):返回obj在集合中首次出现的位置,如果不存在,则返回-1
        System.out.println(list.indexOf(123));
        System.out.println(list.remove(1));
        //Object set(int index,Object ele):设置指定的index位置的元素为ele
        list.set(1,"aa");
        System.out.println(list);
        //List sublist(int fromIndex,int toIndex):返回从fromIndex到toIndex位置的左闭右开的集合
        System.out.println(list.subList(1, 3));
    }
}
