package DAO;

import jdbcutil.jdbcutility;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cc
 * @date 2022年08月12日 17:51
 */
public class DAOtest {
    //封装了数据表的增删改查操作
    public void update(Connection connection,String sql,Object...args) throws Exception{
        //sql中占位符的个数与可变形参的个数相同

        PreparedStatement ps=connection.prepareStatement(sql);
        for(int i=0;i<args.length;i++){
            ps.setObject(i+1, args[i]);//小心参数声明错误
        }
        ps.execute();
        jdbcutility.closeResource(connection,ps);
    }


    public  <T> Object GetInstance1(Connection connection, Class<T> clazz, String sql, Object...args) throws Exception{
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

    public <T> List<T> getForlist(Connection connection,Class<T> clazz, String sql, Object...orgs) throws Exception{

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

    public  <E> E getValue(Connection connection,String sql,Object...args) throws Exception{
        PreparedStatement ps=connection.prepareStatement(sql);
        for(int i =0;i<args.length;i++){
            ps.setObject(i+1, args[i]);
        }
        ResultSet resultSet = ps.executeQuery();
        if(resultSet.next()){
            return (E) resultSet.getObject(1);
        }
        jdbcutility.closeResource(connection,ps);


        return null;
    }
}
