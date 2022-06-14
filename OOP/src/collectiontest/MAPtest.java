package collectiontest;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cc
 * @date 2022年06月14日 21:19
 */
public class MAPtest {
    @Test
    public void test1(){
        Map map =new HashMap();
        map.put(null,123);
        map.put(null,null);
    }
}
