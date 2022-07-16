package Dynic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author cc
 * @date 2022年07月16日 14:05
 */
//动态代理的模式

interface Human{
    String getBelief();

    void eat(String food);

}
//被代理类
class Superman implements Human{

    @Override
    public String getBelief() {
        return "i believe";
    }

    @Override
    public void eat(String food) {
        System.out.println("wxihuan"+food);
    }
}

//要想实现动态代理
//问题一：如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象
//问题二：当通过代理类的对象调用方法时，如何动态的去调用被代理类中的同名方法

class ProxyFactory{
//    调用此方法，返回一个代理类的对象，解决问题一
    public static Object getProxyInstance(Object obj){//obj:被代理类的对象

        MyInvocationHandler handler=new MyInvocationHandler();
        handler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);

    }
}
class MyInvocationHandler implements InvocationHandler{
    private Object obj;//赋值时,也需要使用被代理类的对象进行赋值

    public void bind(Object obj){
        this.obj=obj;
    }
//通过代理类的对象调用方法a时，就会自动的调用如下的方法：invoke(),将被代理类要执行的方法a的功能声明在invoke()中
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //method:即为代理类对象调用的方法,此方法作为了被代理类对象要调用的方法
//        obj:被代理类的对象
        Object invoke = method.invoke(obj, args);
        //上诉方法的返回值就作为invoke的返回值
        return invoke;
    }
}

public class DynmicProxy {
    public static void main(String[] args) {
        Superman superman = new Superman();
//        代理类的对象
        Human proxyInstance =(Human) ProxyFactory.getProxyInstance(superman);
        //通过代理类对象调用方法时,会自动的调用代理类中同名类的方法
        proxyInstance.getBelief();
    }
}
