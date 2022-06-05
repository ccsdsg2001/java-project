package collectiontest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author cc
 * @date 2022年06月05日 23:03
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(new String("da"));
        collection.add(false);


        Iterator iterator = collection.iterator();
        //方式一:`
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

//        方式二
        for(int i =0;i<collection.size();i++){
            System.out.println(iterator.next());
        }

//        方式三:
        while (iterator.hasNext()) {
           Object obj=iterator.next();
           if("da".equals(obj)){
               iterator.remove();
           }
//            System.out.println(iterator.next());
        }


    }
}
