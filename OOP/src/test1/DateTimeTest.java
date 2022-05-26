package test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author cc
 * @date 2022年05月24日 22:36
 */
public class DateTimeTest {
    public static void main(String[] args) throws ParseException {
        long time =System.currentTimeMillis();
        System.out.println(time);

        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());
        Date date1=new Date(1653403771334L);
        System.out.println(date1.toString());

        java.sql.Date date2 = new java.sql.Date(1653403771334L);
        System.out.println(date2.toString());

//        将java.util.Date对象转换为java.sql.Date对象


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date date3 = new Date();
        simpleDateFormat.format(date3);

        String srt="";
        simpleDateFormat.parse(srt);
    }
}
