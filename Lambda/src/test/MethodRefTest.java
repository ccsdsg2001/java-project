package test;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 方法引用的使用
 *1.使用情境：当要传递给Lambda体的操作，已经有实现的方法了，可以使用方法引用
 * 2.方法引用，本质上就是Lambda表达式，而Lambda表达式作为函数式接口的实例。所以方法引用，也就是函数接口的实例
 * 3。使用格式： 类（或对象）：：方法名
 * 4.具体分为如下三种情况
 *  (1)对象：：非静态方法
 *  (2)类 ：：静态方法
 *  (3)类 ：：非静态方法
 *  5.方法引用使用的要求：要求接口中的抽象方法的形参列表和返回值类型与方法引用的方法
 *  的形参列表和返回值类型相同
 * Created by shkstart.
 */
public class MethodRefTest {

	// 情况一：对象 :: 实例方法
	//Consumer中的void accept(T t)
	//PrintStream中的void println(T t)
	@Test
	public void test1() {
		Consumer<String> consumer = s -> System.out.println(s);
		consumer.accept("bneji");
		PrintStream printStream = System.out;
		Consumer<String> consumer1 =printStream::println;
		consumer1.accept("NEO");
		
	}
	
	//Supplier中的T get()
	//Employee中的String getName()
	@Test
	public void test2() {
		Employee employee = new Employee(1001,"tom",23,2300);
		Supplier<String> sup1=()-> employee.getName();
		System.out.println(sup1.get());
		Supplier<String> SUP2=employee ::getName;



	}

	// 情况二：类 :: 静态方法
	//Comparator中的int compare(T t1,T t2)
	//Integer中的int compare(T t1,T t2)
	@Test
	public void test3() {
		Comparator<Integer> com1=(t1,t2)->Integer.compare(t1,t2);

		Comparator<Integer> com2=Integer ::compare;
	}
	
	//Function中的R apply(T t)
	//Math中的Long round(Double d)
	@Test
	public void test4() {
		Function<Double,Long> func=d->Math.round(d);

		Function<Double,Long> func1=Math::round;

	}

	// 情况三：类 :: 实例方法 
	// Comparator中的int comapre(T t1,T t2)
	// String中的int t1.compareTo(t2)
	@Test
	public void test5() {
		Comparator<String> com1=(s1,s2)-> s1.compareTo(s2);


		Comparator<String> com=String ::compareTo;
	}

	//BiPredicate中的boolean test(T t1, T t2);
	//String中的boolean t1.equals(t2)
	@Test
	public void test6() {
		BiPredicate<String,String> pre1= (s1,s2)->s1.equals(s2);
		System.out.println(pre1.test("ad", "da"));

		BiPredicate<String,String> pre2=String::equals;
		
	}
	
	// Function中的R apply(T t)
	// Employee中的String getName();
	@Test
	public void test7() {
		Employee employee = new Employee(1001,"tom",23,2300);
		Function<Employee,String> stringFunction =e -> e.getName();


		Function<Employee,String> stringFu=Employee::getName;


	}

}
