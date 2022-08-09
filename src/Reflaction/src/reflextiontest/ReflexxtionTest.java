package src.reflextiontest;

import org.junit.Test;
import src.test.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

//    如何操作运行时类中指定的方法
    @Test
    public void test21() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class clazz= Person.class;
        Person p = (Person)clazz.newInstance();
//        1.获取指定的某个方法
//        getDeclaredMethod():参数1：指明获取的方法的名称 参数2：指明获取方法的形参列表
        Method show = clazz.getDeclaredMethod("show", String.class);
//        2.保证当前方法是可以访问的
        show.setAccessible(true);
//        invoke():参数1：方法的调用者 参数2：给方法形参赋值的实参.invoke()的返回值即为对应类中调用的方法的返回值
        show.invoke(p,"CHN");

//        调用静态方法，如果调用的运行时类中的方法没有返回值，则此invoke（）返回null
        Method showDesc = clazz.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        Object invoke = showDesc.invoke(Person.class);
        System.out.println(invoke);
    }

    @Test
//    如何调用运行时类中的指定的构造器
    public void test3() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz=Person.class;
//        1。获取指定的构造器
//        getDeclaredConstructor():参数:指明构造器的参数列表
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class);
//        2.保证此构造器是可以访问的
        declaredConstructor.setAccessible(true);
//        3.调用此构造器创建运行时类的对象
        Object tom = declaredConstructor.newInstance("tom");
        System.out.println(tom);

    }

}
