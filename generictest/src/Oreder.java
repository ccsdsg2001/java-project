import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cc
 * @date 2022年07月04日 15:41
 */
public class Oreder<T> {
    String name;
    int id;
//    类的内部结构使用类的泛型
    T ordet;
    public Oreder(){};

    public Oreder(String name, int id, T ordet) {
        this.name = name;
        this.id = id;
        this.ordet = ordet;
    }

    public T getOrdet(){
        return ordet;
    }

    public <E> List<E> copy(E[] arr){
        ArrayList<E> list = new ArrayList();
        return  list;
    }



}

class test1{
    @Test
    public void test(){
        Oreder oreder=new Oreder();
//        (1)如果定义了泛型类,实例化没有指明类的泛型,则认为此泛型类型为Object类型
//要求:如果大家定义了类是带泛型的,建议在实例化时指明类的泛型
        Oreder<String> ored1er=new Oreder<>();
        oreder.getOrdet();
    }
}
