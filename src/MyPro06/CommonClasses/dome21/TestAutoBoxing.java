package src.MyPro06.CommonClasses.dome21;

/**
 * @program: TestJava
 * @description: 测试自动装箱
 * @author: zhouyuanpeng
 * Created by  2019-12-04 14:47
 */

public class TestAutoBoxing {
    public static void main(String[] args) {
        // 对象范围在 -128到127 之间就不再开辟新的空间，在缓存数组中找

        Integer a = 100; //自动装箱
        //相当于
        Integer a1 = Integer.valueOf(100);
        Integer b = 100;

        System.out.println(a==b);

        //超过Integer 对象的范围，开辟新的空间

        Integer aa = 1000;
        Integer bb = 1000; //Integer 对象范围-128到127

        System.out.println("aa==bb"+" = "+(aa==bb));


    }

}
