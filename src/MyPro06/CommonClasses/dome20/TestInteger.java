package src.MyPro06.CommonClasses.dome20;

/**
 * @program: TestJava
 * @description: 各个类型之间的转换+测试常用包装类
 * @author: zhouyuanpeng
 * Created by  2019-12-04 14:48
 */

public class TestInteger {
    public static void main(String[] args) {

        Integer i1 = new Integer(123);
        Integer i2 = new Integer("123");

        System.out.println("i1==i2：" + (i1==i2)); //false
        System.out.println("i1.equals(i2)" + i1.equals(i2)); //比较内容
        System.out.println(i2.toString()); //说明类Integer重写了toString方法

        Integer i3 = new Integer(128);

        System.out.println(i1.compareTo(i3)); //-1
        System.out.println(i1.compareTo(i2)); //0
        System.out.println(i3.compareTo(i2)); //1

        //1.Integer类型对象-->int基本数据类型 包装类对象.intValue()

        int i = i1.intValue();
        System.out.println(i);
        //比较大小
        System.out.println(Integer.max(10,20));

        //2.int --> Integer

        Integer i4 = Integer.valueOf(123);



        //3.String --> int 包装类类名.parseInt(String s)

        int ii = Integer.parseInt("234");

        //4. int --> String

        String str = ii+"";
        System.out.println(str);
        String s = String.valueOf(ii);

        //5.String --> Integer
        Integer i5 = new Integer("345");

        //6.Integer --> String
        String ss = i5.toString();
        System.out.println(ss);






    }
}
