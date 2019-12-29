package src.MyPro06.CommonClasses.dome25;

import java.util.Date;

/**
 * @program: TestJava
 * @description: 测试java.util.Date 类
 * @author: zhouyuanpeng
 * Created by  2019-12-29 19:14
 */

public class TestDate {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(System.currentTimeMillis()); //当前时间的时间戳

        Date d2 = new Date(1000l);
        System.out.println(d2.toGMTString());

        System.out.println(d.getTime()); //当前时间距离1970年的0时0分0秒的毫秒值
        //比较时间的大小
        System.out.println(d.before(d2)); //false d是当前时间，当前时间不大于1970年的时间
        System.out.println(d.after(d2)); //true

        System.out.println(d.getTime()<d2.getTime());
        System.out.println(d.getTime()>d2.getTime());

        System.out.println(d2.toString());

        /**
         * java.util.Date 类的子类
         */

        java.sql.Date sqlDate = new java.sql.Date(1000l);
        System.out.println(sqlDate);

        java.sql.Time sqlTime = new java.sql.Time(1000l);
        System.out.println(sqlTime.toGMTString());

        java.sql.Timestamp timestamp = new java.sql.Timestamp(1001l);
        System.out.println(timestamp);
    }

}
