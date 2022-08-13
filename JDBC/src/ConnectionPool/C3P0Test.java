package ConnectionPool;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DataSources;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author cc
 * @date 2022年08月13日 18:24
 */
public class C3P0Test {
    @Test
    public void test1() throws PropertyVetoException, SQLException {
        //方式一：
        //获取C3P0连接池
        ComboPooledDataSource cb = new ComboPooledDataSource();
        cb.setDriverClass("com.mysql.jdbc.Driver");
        cb.setJdbcUrl("jdbc:mysql://localhost:3306/atguigudb?useUnicode=true&characterEncoding=utf8\n");
        cb.setUser("root");
        cb.setPassword("root");
//        通过设置参数来管理数据库
//        设置初始时数据库连接池中的连接数
        cb.setInitialPoolSize(10);

        Connection connection = cb.getConnection();
        System.out.println(connection);
        DataSources.destroy(cb);
    }

//    方式二：使用配置文件
    public void test2()throws Exception{
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("c3po.tld");
        Connection connection = comboPooledDataSource.getConnection();

    }
}
