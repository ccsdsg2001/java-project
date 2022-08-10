package PreparedStatement;

import jdbcutil.jdbcutility;
import org.junit.Test;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * @author cc
 * @date 2022年08月10日 14:13
 */
public class TableForQuery {

    @Test
    public void tes2t1() throws Exception {
        String sql ="SELECT first_name,last_name FROM employees WHERE first_name =";
        queryForNormal(sql,0);
    }
//    针对查询的通用操作
//    针对表的字段名与类的属性不相同的情况:1.必须声明sql时,使用类的属性名来命名字段的命名.2.使用ResultSetMetaData时,需要使用
//    getColumnLabel()来替换getColumnName来获取列的别名.如果sql中没有给字段其别名,getColumnLabel()获取的就是列名
    public tableClass queryForNormal(String sql, Object...args) throws  Exception{
        Connection connection = jdbcutility.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for(int i =0;i<args.length;i++){
            preparedStatement.setObject(i+1, args[i]);
        }
        ResultSet resultSet = preparedStatement.executeQuery();
//        获取结果集的元数据
        ResultSetMetaData metaData = resultSet.getMetaData();
        //通过元数据来获取结果集中的列数
        int columnCount = metaData.getColumnCount();
        if(resultSet.next()) {
            tableClass tableClass = new tableClass();
            for (int i = 0; i < columnCount; i++) {
                Object object = resultSet.getObject(i + 1);
                //获取每个列的列名
                String columnName = metaData.getColumnLabel(i+1);
                //给对象指定的列名字属性,赋值为columnValue,通过反射
                Field declaredField = tableClass.class.getDeclaredField(columnName);
                declaredField.setAccessible(true);
                declaredField.set(tableClass, object);
            }
            return tableClass;
        }
        jdbcutility.closeResource(connection,preparedStatement);

        return null;
    }
//    针对表的查询工作
    @Test
    public void test1() throws  Exception{
        Connection connection = jdbcutility.getConnection();
        String sql="SELECT first_name,last_name FROM employees ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        执行sql语句，并返回结果集
        ResultSet resultSet = preparedStatement.executeQuery();
//        处理结果集
        if(resultSet.next()){//判断结果集下一条是否有数据，如果有数据返回true，并指针下移，如果没有则返回false
            //获取当前这条数据各个字段的值
            String s1 = resultSet.getString(1);
            String string = resultSet.getString(2);
             //方式一:直接显示
//            System.out.println("id="+ anInt + ",name" + string );
//           方式三:将数据封装成一个对象
            tableClass tableClass = new tableClass(s1, string);
            System.out.println(tableClass);
            jdbcutility.closeResource(connection,preparedStatement);

        }

    }
}
