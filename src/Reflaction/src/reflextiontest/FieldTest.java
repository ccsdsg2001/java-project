package src.reflextiontest;

import org.junit.Test;
import src.test.Person;

import java.lang.reflect.Field;

/**
 * @author cc
 * @date 2022年07月13日 22:19
 */
public class FieldTest {
//    获取当前运行时类的属性结构
//    getFields():获取当前运行时类及其父类中声明为public访问权限的属性
    @Test
    public void test1(){
        Class clazz= Person.class;
        Field[] field = clazz.getFields();
        for(Field field1:field){
            System.out.println(field1);
        }
//getDeclaredFields():获取当前运行时类中声明的所有属性。（不包含父类中声明的属性）
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field field3:declaredFields ){
            System.out.println(field3);
        }

    }

//    权限修饰符 数据类型 变量名
    @Test
    public void test2(){
        Class clazz= Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field field3:declaredFields ){
//            1.权限修饰符
            int modifiers = field3.getModifiers();
            System.out.println(modifiers);
//              2.数据类型
            Class type =field3.getType();
            System.out.println(type);
//3.变量名
            String name = field3.getName();
            System.out.println(name);
        }
    }
}
