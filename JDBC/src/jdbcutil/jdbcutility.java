package jdbcutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author cc
 * @date 2022年08月09日 10:01
 */
public class jdbcutility {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atguigudb?useUnicode=true&characterEncoding=utf8", "root", "root");
        return connection;
    }

    public static void closeResource(Connection connection, Statement ps){
        try{
            if(ps!=null){
                ps.close();
            }
        }catch (Exception E){
            E.printStackTrace();
        }
        try{
            if(connection!=null){
                connection.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
