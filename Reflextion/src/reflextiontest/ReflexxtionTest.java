package reflextiontest;

import org.junit.Test;
import test.Person;

import java.lang.reflect.Field;

/**
 * @author cc
 * @date 2022年07月14日 16:36
 */
public class ReflexxtionTest {
//    调用运行类中指定的结构：属性，方法，构造器
    @Test
    public void testField() throws Exception {
        Class clazz= Person.class;
//        创建运行时类的对象
        Person o = (Person) clazz.newInstance();

//        获取指定的属性:要求运行时类中声明的属性为public
//        通常不常用此方式
        Field id = clazz.getField("id");
//        设置当前属性的值
//        set():参数1:指明设置哪个对象的属性 参数2:将此属性值设置为多少
        id.set(o,1001);
//        获取当前属性的值
//        get():参数1:获取哪个对象的当前属性值
        id.get(o);

    }


//    如何操作运行时类指定的属性
    @Test
    public void test1() throws  Exception{
        Class clazz= Person.class;
//        创建运行时类的对象
        Person o = (Person) clazz.newInstance();

//        1.getDeclaredField(String fieldname):获取运行时类中指定变量名的属性
        Field name = clazz.getDeclaredField("name");
//        2.保证当前属性是可以访问的
        name.setAccessible(true);
//        3.获取，设置指定对象的此属性值
        name.set(o,"Tom");
        System.out.println(name.get(o));
    }
}
