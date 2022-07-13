package reflextiontest;

import org.junit.Test;
import test.Person;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author cc
 * @date 2022年07月13日 22:35
 */
public class MethodTest {
    @Test
    public void test(){
//        获取运行时类的方法结构
//        getMethods():获取当前运行时类及其所有父类中声明为public权限的方法
        Class clazz= Person.class;
        Method[] methods = clazz.getMethods();
        for(Method method:methods){
            System.out.println(method);
        }
//getDeclaredMethods():获取当前运行类所有声明的所有方法（不包含父类）
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method method1:declaredMethods){
            System.out.println(method1);
        }
    }

//    权限修饰符 返回值类型 方法名（参数类型1 形参名1，...)throws Exception{}
    @Test
    public void test1(){


        Class clazz= Person.class;
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method method2:declaredMethods){
            //        1.获取方法声明的注解
            Annotation[] annotations = method2.getAnnotations();
            for(Annotation a:annotations){
                System.out.println(a);
// 2.权限修饰符
                System.out.println(Modifier.toString(method2.getModifiers())+"\t");
//                3.返回值类型
                System.out.println(method2.getReturnType().getName() + "\t");
//                4.方法名
                System.out.println(method2.getName());
//                5.形参列表
                Class[] parameterTypes = method2.getParameterTypes();
                if(!(parameterTypes==null&&parameterTypes.length==0)){
                    for(Class aon:parameterTypes){
                        System.out.println(aon.getName());
                    }
                }
//                6.抛出的异常
                Class[] exceptioin=method2.getExceptionTypes();
                if(exceptioin.length>0){
                    for(Class a3:exceptioin){
                        System.out.println(a3);
                    }
                }
            }
        }
    }
}
