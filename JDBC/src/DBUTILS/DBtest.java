package DBUTILS;

import ConnectionPool.DruidTest;
import PreparedStatement.tableClass;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

/**
 * @author cc
 * @date 2022年08月14日 0:23
 */
public class DBtest {
    @Test//插入操作
    public void test() throws Exception {
        QueryRunner queryRunner = new QueryRunner();
        Connection connection = DruidTest.getConnection();
        String sql="INSERT INTO c(name)values(?)";
        int update = queryRunner.update(connection, sql, "1");
        System.out.println(update);
//查询操作
        String sql1="SELECT * FROM emp";
        BeanHandler<tableClass> beanHandler = new BeanHandler<>(tableClass.class);
        BeanListHandler<tableClass> beanHandle1r = new BeanListHandler<>(tableClass.class);
        tableClass query = queryRunner.query(connection, sql1, beanHandler, 23);
        List<tableClass> query1 = queryRunner.query(connection, sql1, beanHandle1r, 23);
        System.out.println(query);
        //MapListHander:是ResultSetHandle接口的实现类,对应表中的一条记录,将字段及响应字段的值作为map中的key和value
        MapListHandler mapListHandler = new MapListHandler();
        List<Map<String, Object>> query2 = queryRunner.query(connection, sql1, mapListHandler, 23);
        System.out.println(query2);

        //ScalarHandler:用于查询特殊值
        ScalarHandler<Object> objectScalarHandler = new ScalarHandler<>();
        Object query3 = queryRunner.query(connection, sql1, objectScalarHandler, 23);

        DbUtils.close(connection);
    }
}
