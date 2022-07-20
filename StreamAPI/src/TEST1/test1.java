package TEST1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author cc
 * @date 2022年07月18日 10:32
 */
public class test1 {
//    1.筛选与切片
    @Test
    public void test1(){
        List<Employee> employees = EmployeeData.getEmployees();
//        filter(Predicate p)--接受Lambda,从流中排除某些元素
        Stream<Employee> stream=employees.stream();
        stream.filter(e->e.getSalary()>7000).forEach(System.out::println);
//        limit(n)--截断流,使其元素不超过给定输量
        employees.stream().limit(3).forEach(System.out::println);
//        skip(n)--跳过元素,返回一个扔掉了前n个元素的流,若流中元素不足n个,则返回一个空流,与limit(n)互补
        employees.stream().skip(3).forEach(System.out::println);
        //distinct()--筛选,通过流所生成的元素的hashcode()和equals()去除重复元素
        employees.stream().distinct().forEach(System.out::println);
    }

 //映射
    @Test
    public void test2(){
//        map(Function f)——接收一个函数作为参数，将元素转换成其他形式或提取信息，该函数会被应用到每个元素上，并将其映射成一个新的元素。
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);

//        练习1：获取员工姓名长度大于3的员工的姓名。
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<String> namesStream = employees.stream().map(Employee::getName);
        namesStream.filter(name -> name.length() > 3).forEach(System.out::println);
        System.out.println();
        //练习2：
        Stream<Stream<Character>> streamStream = list.stream().map(test1::fromStringToStream);
        streamStream.forEach(s ->{
            s.forEach(System.out::println);
        });
        System.out.println();
//        flatMap(Function f)——接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流。
        Stream<Character> characterStream = list.stream().flatMap(test1::fromStringToStream);
        characterStream.forEach(System.out::println);

    }

    //将字符串中的多个字符构成的集合转换为对应的Stream的实例
    public static Stream<Character> fromStringToStream(String str){//aa
        ArrayList<Character> list = new ArrayList<>();
        for(Character c : str.toCharArray()){
            list.add(c);
        }
        return list.stream();

    }

    //3.排序
    @Test
    public void test4(){
        //sorted()--自然排序
        List<Integer> integers = Arrays.asList(12, 3, 2, 42, 45);
        integers.stream().sorted().forEach(System.out::println);
        //sorted(Comparator)--定制排序
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().sorted((e1,e2)->{return Integer.compare(e1.getAge(),e2.getAge());}).forEach(System.out::println);

    }
}
