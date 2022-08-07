import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author cc
 * @date 2022年08月07日 15:08
 */
public class jdBCTEST {
    //    方式一:
    @Test
    public void test1() throws SQLException {
        Driver driver = new com.mysql.jdbc.Driver();

        String url = "jdbc:mysql://localhost:3306/atguigudb?useUnicode=true&characterEncoding=utf8";
//        jdbc:mysql:协议
//        localhost:ip地址
//        3306:默认mysql的端口号
//        test:test数据库
        Properties info = new Properties();
//        将用户名和密码封装在Properties中
        info.setProperty("user", "root");
        info.setProperty("password", "root");
        Connection connect = driver.connect(url, info);
        System.out.println(connect);
    }

    //    方式二:对方式一的迭代,在如下的程序中不出现第三方的API,使程序具有更好的可移植性
    @Test
    public void test2() throws Exception {
//        1.获取Driver实现类对象,使用反射
        Class clazz = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();

//        2.提供要连接的数据库
        String url = "jdbc:mysql://localhost:3306/atguigudb?useUnicode=true&characterEncoding=utf8";

//        3.提供连接需要的用户名和密码
        Properties info = new Properties();
        info.setProperty("user", "root");
        info.setProperty("password", "root");
        Connection connect = driver.connect(url, info);
        System.out.println(connect);
    }

    //    方式三:使用DriverManager
    @Test
    public void test3() throws Exception {
        //        1.获取Driver实现类对象,使用反射
        Class clazz = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();

//        注册驱动
        DriverManager.registerDriver(driver);
//        获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atguigudb?useUnicode=true&characterEncoding=utf8", "root", "root");
        System.out.println(connection);
    }

    //    方式四:
    @Test
    public void test4() throws Exception {
        //        1.获取Driver实现类对象,使用反射
        Class.forName("com.mysql.jdbc.Driver");

//        获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atguigudb?useUnicode=true&characterEncoding=utf8", "root", "root");
        System.out.println(connection);
    }

//    方式五:最终版.将数据库连接需要的4个基本信息声明在配置文件下,通过读取配置文件的方式
//    好处:1.实现了数据与代码的分离,实现了解耦. 2,如果需要修改配置文件信息,可以避免程序重新打包
    @Test
    public void GETCONNECTION5() throws Exception {
//1.读取配置文件中的4个基本信息
        InputStream resourceAsStream = Connection.class.getClassLoader().getResourceAsStream("E:\\si\\JDBC\\src\\jdbc.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        String user=properties.getProperty("user");
        String password=properties.getProperty("password");
        String url=properties.getProperty("url");
        String driverClass=properties.getProperty("driverClass");
//        2.加载驱动
        Class.forName(driverClass);
        Connection connection=DriverManager.getConnection(url,user,password);
        System.out.println(connection);




    }
}
