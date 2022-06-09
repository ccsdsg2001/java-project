package collectiontest;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
}
