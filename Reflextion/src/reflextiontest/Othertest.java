package reflextiontest;

import org.junit.Test;
import test.Person;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author cc
 * @date 2022年07月14日 16:10
 */
public class Othertest {
//    获取构造器结构
    @Test
    public void test1(){
//        getConstructors():获取当前运行时类中声明为public 的构造器
        Class clazz= Person.class;
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor:constructors){
            System.out.println(constructor);
        }

//getDeclaredConstructors():获取当前运行时类中声明的所有构造器
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor constructor:declaredConstructors){
            System.out.println(constructor);
        }

    }

//    获取运行时类的父类
    @Test
    public void test2(){
        Class clazz= Person.class;
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
        //    获取运行时类的带泛型父类
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
//        //    获取运行时类的带泛型父类的泛型
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        System.out.println((Class)actualTypeArguments[0]);
        //获取运行类实现的接口
        Class[] interfaces = clazz.getInterfaces();
        for(Class c :interfaces){
            System.out.println(c);
        }
//        获取运行时类父类实现的接口
        Class[] interfaces1 = clazz.getSuperclass().getInterfaces();
        for(Class c:interfaces1){
            System.out.println(c);
        }
//        获取运行时类所在的包
        Package aPackage = clazz.getPackage();
        System.out.println(aPackage);
//        获取运行类声明的注解
        Annotation[] annotations = clazz.getAnnotations();
        System.out.println(annotations);

    }
}
