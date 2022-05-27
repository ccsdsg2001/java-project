package test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
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
//        simpleDateFormat.parse(srt);


        Calendar calendar=Calendar.getInstance();
        calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        calendar.set(Calendar.DAY_OF_YEAR, 22);
        calendar.add(Calendar.DAY_OF_YEAR,3);

        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();
        LocalDateTime now2 = LocalDateTime.now();

        System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);

        LocalTime of = LocalTime.of(12, 30);
        System.out.println(of);

        Instant now3 = Instant.now();
        System.out.println(now3);
        OffsetDateTime offsetDateTime = now3.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);


        DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String s1=isoLocalDateTime.format(of);
        System.out.println(s1);
    }
}
