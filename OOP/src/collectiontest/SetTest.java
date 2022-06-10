package collectiontest;

import org.junit.Test;

import java.util.*;

/**
 * @author cc
 * @date 2022年06月09日 21:47
 */
public class SetTest {
    @Test
    public void test(){
        Set set=new HashSet();
        set.add(123);
        set.add(423);
        set.add("AA");
        set.add(1239);
        set.add(123);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
        Set set=new LinkedHashSet();
        set.add(123);
        set.add(423);
        set.add("AA");
        set.add(1239);
        set.add(123);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test14(){
        TreeSet set = new TreeSet();
        set.add(123);
        set.add(342);
        set.add(3);
        set.add(1232);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test1(){
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        TreeSet set = new TreeSet(comparator);
        set.add(123);
        set.add(342);
        set.add(3);
        set.add(1232);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    @Override
    public int hashCode() {
//        int result
        return super.hashCode();
    }
}
