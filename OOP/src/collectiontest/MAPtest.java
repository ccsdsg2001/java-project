package collectiontest;

import org.junit.Test;

import java.util.*;

/**
 * @author cc
 * @date 2022年06月14日 21:19
 */
public class MAPtest {
    @Test
    public void test1(){
        Map map =new HashMap();
//         map =new LinkedHashMap();
        map.put(null,123);
        map.put("vv",1233);//添加
        map.put("vv",12332);//修改
        map.put(null,null);
        Map map1=new HashMap();
        map.putAll(map);
        System.out.println(map);
        System.out.println(map.remove("vv"));
        map.clear();
        System.out.println(map.size());
        System.out.println(map.get("vv"));
        System.out.println(map.containsKey("vv"));
        System.out.println(map.containsValue(1233));
        System.out.println(map.isEmpty());

        //遍历
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Collection values = map.values();
        for(Object obj:values){
            System.out.println(obj);
        }

        Set set1 = map.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            Object object =iterator1.next();
            System.out.println(object);
        }


    }

    @Test
    public void test(){
        TreeMap map = new TreeMap(new Comparator(){});
        map.put("AA", 123);
        map.put("bb", 1223);
        map.put("vv", 1423);
        map.put("cc", 1523);

    }


}
