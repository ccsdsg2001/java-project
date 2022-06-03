import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @author cc
 * @date 2022年06月04日 1:21
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("aa");
        collection.add("bb");
        collection.add(123);
        collection.add(new Date());

        System.out.println(collection.size());


        Collection coll=new ArrayList();
        coll.add("da");
        coll.add(123);
        coll.addAll(collection);
        System.out.println(coll);
        System.out.println(coll.isEmpty());

        coll.clear();
    }
}
