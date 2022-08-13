package ConnectionPool;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author cc
 * @date 2022年08月13日 19:52
 */
public class DBCPTEST {
//第一种方式:不推荐
    public void test() throws SQLException {
        //创建DBCP的数据
        BasicDataSource Source = new BasicDataSource();
        Source.setDriverClassName("");
        Source.setUrl("");
        Source.setUsername("");
        Source.setPassword("");

        Source.setInitialSize(10);

        Connection connection = Source.getConnection();
    }

    //方式二,使用配置文件
    public void test2() throws Exception {
        Properties properties = new Properties();
        InputStream inputStream =ClassLoader.getSystemClassLoader().getResourceAsStream("");
        properties.load(inputStream);
        BasicDataSourceFactory.createDataSource(properties);

    }
}
