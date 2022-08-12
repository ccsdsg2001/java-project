package PreparedStatement;

import jdbcutil.jdbcutility;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author cc
 * @date 2022年08月12日 15:05
 */
public class InsertTest {
    //    使用PreparedStatement实现批量插入
    @Test
    public void test1() throws Exception {
        Connection connection = jdbcutility.getConnection();
        String sql = "INSERT INTO goods(name)values (?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        for(int i =1;i<=20000;i++){
            ps.setObject(1,"name_"+i);
            ps.execute();
        }
        jdbcutility.closeResource(connection,ps);
    }
}

