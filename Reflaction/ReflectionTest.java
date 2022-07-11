import org.junit.Test;

import javax.print.DocFlavor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author cc
 * @date 2022年07月12日 2:51
 */
public class ReflectionTest {
    @Test
    public void  TEST(){
        Person p1=new Person("to", 1);

        p1.Age=10;
        System.out.println(p1.toString());
        p1.show();


//        在外部,不能通过对象去调用私有结构,以及私有的构造器
    }

    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class clazz=Person.class;
//        1.通过反射,创建Person类的对象
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        Object tom = constructor.newInstance("Tom", 12);
        Person person =(Person) tom;

        System.out.println(person.toString());
//      2.通过反射,调用对象的指定属性和方法
        Field name = clazz.getDeclaredField("name");
        name.set("pe", 10);

        Method show = clazz.getDeclaredMethod("show");
        show.invoke("p");
//        通过反射,可以调用Person类的私有结构,如方法,属性

        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Person person1 = (Person) declaredConstructor.newInstance("Jerry");
        System.out.println(person1);

//        调用私有属性
        Field name3=clazz.getDeclaredField("name");
        name3.setAccessible(true);
        name3.set(person1, "jmmm");
        System.out.println(person1);

//
//        调用私有方法
        Method at = clazz.getDeclaredMethod("AT", DocFlavor.STRING.class);
        at.setAccessible(true);
        at.invoke(person1,"zhj");

    }

    @Test
    public  void test3() throws ClassNotFoundException {
//        方式一:调用运行时类的属性:.class
        Class<Person> class1=Person.class;
//        方式二：通过运行时类的对象,调用getClass()
        Person p1=new Person();
        p1.getClass();
        Class class2=p1.getClass();
//        方式三:调用Class的静态方法:forName(String classPath)
        Class<?> class3 = Class.forName(String.valueOf(p1.getClass()));
//方式四:使用类的加载器:ClassLoader
        ClassLoader classLoader= ReflectionTest.class.getClassLoader();
        Class class4=classLoader.loadClass(p1.getName());








        )

    }
}
