package PreparedStatement;

import jdbcutil.jdbcutility;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cc
 * @date 2022年08月11日 9:08
 */
public class PreparedStatement {
//    使用PreparedStatement实现针对于不同表得通用查询操作,返回表中的一条记录
    public  <T> Object GetInstance(Class<T> clazz,String sql,Object...args) throws Exception{
        Connection connection = jdbcutility.getConnection();
        java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for(int i =0;i<args.length;i++){
            preparedStatement.setObject(i+1, args[i]);
        }
        ResultSet resultSet = preparedStatement.executeQuery();
//        获取结果集的元数据
        ResultSetMetaData metaData = resultSet.getMetaData();
        //通过元数据来获取结果集中的列数
        int columnCount = metaData.getColumnCount();
        while (resultSet.next()) {
            T t = clazz.newInstance();
            for (int i = 0; i < columnCount; i++) {
                Object object = resultSet.getObject(i + 1);
                //获取每个列的列名
                String columnName = metaData.getColumnLabel(i+1);
                //给对象指定的列名字属性,赋值为columnValue,通过反射
                Field declaredField = clazz.getDeclaredField(columnName);
                declaredField.setAccessible(true);
                declaredField.set(clazz, object);
            }
            return t;
        }
        jdbcutility.closeResource(connection,preparedStatement);

        return null;
    }

    public <T>List<T> getForlist(Class<T> clazz,String sql,Object...orgs) throws Exception{
        Connection connection = jdbcutility.getConnection();
        java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for(int i =0;i<orgs.length;i++){
            preparedStatement.setObject(i+1, orgs[i]);
        }
        ResultSet resultSet = preparedStatement.executeQuery();
//        获取结果集的元数据
        ResultSetMetaData metaData = resultSet.getMetaData();
        //通过元数据来获取结果集中的列数
        int columnCount = metaData.getColumnCount();
        ArrayList<T> list = new ArrayList<>();
        while (resultSet.next()) {
            T t = clazz.newInstance();
            for (int i = 0; i < columnCount; i++) {
                Object object = resultSet.getObject(i + 1);
                //获取每个列的列名
                String columnName = metaData.getColumnLabel(i+1);
                //给对象指定的列名字属性,赋值为columnValue,通过反射
                Field declaredField = clazz.getDeclaredField(columnName);
                declaredField.setAccessible(true);
                declaredField.set(clazz, object);
            }
            list.add(t);
        }
        jdbcutility.closeResource(connection,preparedStatement);
        return list;
    }


}

