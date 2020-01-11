package 基本概念.Java.时间;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class 时间 {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//    static LocalDateTime time = LocalDateTime.parse("2019/11/17 23:12:13", formatter);
    static LocalDateTime time = LocalDateTime.now();
    //LocalDate 即年月日 无时分秒
    //LocalTime 即时分秒 无年月


    public static void main(String[] args) {
        System.out.println(formatter.format(time));

        System.out.println("***************************************");
        System.out.println(time.getYear());
        System.out.println(time.getMonth());
        System.out.println(time.getDayOfYear());
        System.out.println(time.getDayOfMonth());
        System.out.println(time.getDayOfWeek());
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());
        System.out.println("***************************************");



    }


}
