import org.junit.Test;

import java.util.*;

/**
 * @author cc
 * @date 2022年07月04日 15:05
 */
public class test {
//    不使用泛型前情况
    @Test
    public void tes1(){
        ArrayList list =new ArrayList();

        list.add(94);
        list.add(78);
        list.add(43);
        list.add(21);
//        问题一：类型不安全
        list.add("tom");
        for(Object sc:list){
//           问题二：强转时，可能出现ClassCastException
            int sct=(Integer)sc;
            System.out.println(sct);
        }
    }

//    使用泛型后的情况:以Arraylist情况
    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(1212);
        list.add(1232);
        list.add(122);
        list.add(124);
//        编译时，进行类型检查，保证数据的安全
//        list.add("tom");
//        for(Integer score:list){
//            避免了强转工作
//            int stc=score;
//            System.out.println(stc);
//        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

//    hashmap为例
    public void test3(){
//        Map<String, Integer> map = new HashMap<String,Integer>();
//        类型推断
        Map<String, Integer> map = new HashMap<>();
        map.put("tom", 84);
        map.put("tom2", 84);
        map.put("tom3", 12);
//        泛型的嵌套
        Set<Map.Entry<String,Integer>> entrySet    =map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator=entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            String key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key+"=="+value);
        }
    }
}
