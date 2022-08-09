package PreparedStatement;

import jdbcutil.jdbcutility;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author cc
 * @date 2022年08月09日 8:53
 */
public class CRUD {
    @Test
    public void testupdate() throws Exception {
//        String sql="DELETE FROM jobs WHERE job_id = ? ";
//        update(sql,"cc");

        String sql1="UPDATE  jobs SET min_salary = ? WHERE max_salary= ? ";
        update(sql1, "90004","4200");
    }
//    通用的增删改操作
    public void update(String sql,Object...args) throws Exception{
        //sql中占位符的个数与可变形参的个数相同
        Connection connection = jdbcutility.getConnection();
        PreparedStatement ps=connection.prepareStatement(sql);
        for(int i=0;i<args.length;i++){
            ps.setObject(i+1, args[i]);//小心参数声明错误
        }
        ps.execute();
        jdbcutility.closeResource(connection,ps);
    }

//    修改表中的一条记录
    @Test
    public void modifytest() throws SQLException, ClassNotFoundException {
//        1.获取数据库的连接
        Connection connection = jdbcutility.getConnection();
//        2.预编译sql语句,返回PreparedStatement的实例
        String sql="UPDATE jobs SET job_title=? WHERE job_id =?";
        PreparedStatement ps=connection.prepareStatement(sql);
//        3.填充占位符
        ps.setString(1, "cscsc");
        ps.setString(2, "cc");
//        4,执行
        ps.execute();
//        5.资源的关闭
        jdbcutility.closeResource(connection,ps);
    }
    //    向表中添加一条数据
    @Test
    public void addtest() throws Exception {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atguigudb?useUnicode=true&characterEncoding=utf8", "root", "root");
        String sql = "INSERT INTO jobs(job_id,job_title)values(?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);

//        InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbctest/jdbc.properties");
//        Properties properties = new Properties();
//        properties.load(resourceAsStream);
//        String user=properties.getProperty("user");
//        String password=properties.getProperty("password");
//        String url=properties.getProperty("url");
//        String driverClass=properties.getProperty("driverClass");
////        2.加载驱动
//        Class.forName(driverClass);
//        Connection jdbcutility= DriverManager.getConnection(url,user,password);
//        System.out.println(jdbcutility);
        try {
            Class.forName("com.mysql.jdbc.Driver");

//        获取连接
//        System.out.println(jdbcutility);
//        5.填充占位符
            ps.setString(1, "cc");
            ps.setString(2, "da");
//        6.执行操作
            ps.execute();
//        7.资源关闭

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

            ps.close();
            connection.close();
        }
    }
}

