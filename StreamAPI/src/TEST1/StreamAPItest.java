package TEST1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author cc
 * @date 2022年07月18日 10:03
 */
public class StreamAPItest<E> {
    //创建方式一:通过集合
    @Test
    public void test1(){
        List<Employee> employees=EmployeeData.getEmployees();
        //default StreamAPItest<E> stream():返回一个顺序流
        Stream<Employee> stream= employees.stream();
        //default StreamAPItest<E> parallelStream():返回一个并行流
        Stream<Employee> parallelStream =  employees.parallelStream();

    }

    //创建方式二:通过数组
    @Test
    public void test2(){
        int[] arr=new int[]{1,2,3,4,5};
        //调用Arrays类的static <T> StreamAPItest<T> stream(T[] array):返回一个流
        IntStream stream= Arrays.stream(arr);

        Employee e1=new Employee(1,"tom");
        Employee e2=new Employee(2, "TOM");
        Employee[] arr1=new Employee[]{e1,e2};
        Stream<Employee> stream1=  Arrays.stream(arr1);
    }
    //创建Stream方式三:通过Stream的of()
    @Test
    public void test3(){
        Stream<Integer> stream= Stream.of(1,2,3,4,5,6);
    }

    //创建Stream方式四:创建无限流
    @Test
    public void test4(){
        //迭代
        //public static<T> Stream<T> iterate(final T seed,final UnaryOperator<T> f)
        Stream.iterate(0,t -> t+2).limit(10).forEach(System.out::println);
        //生成
        //public static<T> Stream<T> generate(Supplier<T> s)
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }

}
