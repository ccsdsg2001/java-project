package TEST1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author cc
 * @date 2022年07月18日 22:25
 */
public class test2 {
//    1.匹配与查找
    @Test
    public void test1(){
        List<Employee> employees=EmployeeData.getEmployees();

        //allMatch(Predicate p)--检查是否匹配所有元素
        //是否所有员工年龄大于18
        employees.stream().allMatch(employee -> employee.getAge()>18);

        //anyMatch(Predicate p)--检查是否至少匹配一个元素
//        是否存在员工的工资大于10000
        employees.stream().anyMatch(employee -> employee.getSalary()>10000);

        //noneMatch(Predicate p)--检查是否没有匹配的元素
        //是否存在员工姓"雷"
        employees.stream().noneMatch(employee -> employee.getName().startsWith("KLEI"));

        //findFirst--返回第一个元素
        employees.stream().findFirst();

        //findAny--返回当前流中的任意元素
        employees.parallelStream().findAny();

        //count--返回流中元素的总个数
        employees.stream().filter(employee -> employee.getSalary()>5000).count();

        //max(Comparator c)--返回流中的最小值
        //返回最高的工资
        employees.stream().min((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary()));

        //min(Comparator c)--返回流中最小值
        //返回最低工资的员工
        employees.stream().min((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary()));

        //forEach(Consumer c)--内部迭代
        employees.stream().forEach(System.out::println);
    }

//    2.归约
    public void test2(){
        //reduce(T identity,BinaryOperator)--可以将流中元素反复结合起来,得到一个值,返回T
        //计算1-10的自然和
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().reduce(0,Integer::sum);

        //reduce(BinaryOperator)--可以将流中元素反复结合起来,得到一个值,返回Optional<T>
        //计算公司所有员工工资的总和
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().map(employee -> employee.getSalary());
    }

    //3.收集
    @Test
    public void test4(){
        //collect(Collector c)--将流转为其他形式,接受一个Collector的接口的实现,用于给Stream中元素做汇总的方法
        //练习一:查找工资大于6000的员工,结果返回一个List或set
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().filter(employee -> employee.getSalary()>6000).collect(Collectors.toList());
        Set<Employee> employeeSet = employees.stream().filter(e -> e.getSalary() > 6000).collect(Collectors.toSet());
    }
}
