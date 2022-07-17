package test;

import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 一、构造器引用
 *      和方法引用类似，函数式接口的抽象方法的形参列表和构造器的形参列表一致。
 *      抽象方法的返回值类型即为构造器的返回值类型
 *
 * 二、数组引用
 *      把数组看成一个类,与构造器引用类似
 *
 * Created by shkstart
 */
public class ConstructorRefTest {
	//构造器引用
    //Supplier中的T get()
    @Test
    public void test1(){
        Supplier<Employee> sup1=()->new Employee();

        Supplier<Employee> sup21=Employee::new;
	}

	//Function中的R apply(T t)
    @Test
    public void test2(){
        Function<Integer,Employee> fu=id -> new Employee(id);

        Function<Integer,Employee> fu1=Employee::new;
	}

	//BiFunction中的R apply(T t,U u)
    @Test
    public void test3(){
        BiFunction<Integer,String,Employee> func1=(id,name)->new Employee(id,name);

        BiFunction<Integer,String,Employee> func=Employee::new;

	}

	//数组引用
    //Function中的R apply(T t)
    @Test
    public void test4(){
        Function<Integer,String[]> fun1=length->new String[length];

        Function<Integer,String[]> fun=String[] ::new
	}
}
