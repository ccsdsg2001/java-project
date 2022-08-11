package BlobTEST;

import jdbcutil.jdbcutility;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author cc
 * @date 2022年08月11日 11:02
 */
public class TEST {
//    向表中插入Blob类型的字段
    @Test
    public void test1() throws Exception{
        Connection connection = jdbcutility.getConnection();
        String sql="INSERT INTO employees(first_name,last_name)VALUES(?,?) ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        FileInputStream fileInputStream = new FileInputStream(new File(""));
        preparedStatement.setBlob(1,fileInputStream);
    }
}
