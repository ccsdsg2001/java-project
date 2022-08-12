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

    //方式二:1.addBatch(),executeBatch(),clearBatch()
    @Test
    public void test12() throws Exception{
        Connection connection = jdbcutility.getConnection();
        String sql = "INSERT INTO goods(name)values (?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        for(int i =1;i<=20000;i++){
//            1.攒sql
            ps.addBatch();
            if(i%500==0){
                //2.执行batch
                ps.executeBatch();
//                3.清空batch
                ps.clearBatch();
            }
        }
        jdbcutility.closeResource(connection,ps);
    }

    //方式三:设置不允许自动提交
    @Test
    public void test122() throws Exception{
        Connection connection = jdbcutility.getConnection();
        String sql = "INSERT INTO goods(name)values (?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        connection.setAutoCommit(false);
        for(int i =1;i<=20000;i++){
//            1.攒sql
            ps.addBatch();
            if(i%500==0){
                //2.执行batch
                ps.executeBatch();
//                3.清空batch
                ps.clearBatch();
            }
        }
        connection.commit();
        jdbcutility.closeResource(connection,ps);
    }
}

