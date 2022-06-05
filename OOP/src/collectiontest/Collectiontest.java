package collectiontest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author cc
 * @date 2022年06月05日 22:29
 */
public class Collectiontest {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(new String("da"));
        collection.add(false);

        boolean contains =collection.contains(123);
        Collection coll1= Arrays.asList(123,323);
        System.out.println(collection.containsAll(coll1));
        System.out.println(contains);
        System.out.println(collection.contains(new String("123")));

        collection.remove(123);
        System.out.println(collection);

        collection.removeAll(coll1);
        System.out.println(collection);

        collection.retainAll(coll1);
        System.out.println(collection);
        System.out.println(collection.equals(coll1));
        System.out.println(coll1.hashCode());
        Object[] arr=collection.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        List arr1=Arrays.asList(new int[]{123,321});
        System.out.println(arr1.size());
    }
}
