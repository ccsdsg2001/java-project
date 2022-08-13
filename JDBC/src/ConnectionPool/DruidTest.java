package ConnectionPool;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author cc
 * @date 2022年08月13日 21:26
 */
public class DruidTest {
    public static Connection getConnection() throws Exception {
//        DruidDataSource druidDataSource = new DruidDataSource();
        Properties pros = new Properties();
        InputStream pros1 = ClassLoader.getSystemClassLoader().getResourceAsStream("pros");
        pros.load(pros1);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pros);
        Connection connection = dataSource.getConnection();

        return connection;

    }
}
