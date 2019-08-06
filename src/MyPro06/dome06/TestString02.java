package src.MyPro06.dome06;

/**
 * @program: TestJava
 * @description: 测试常量池
 * @author: zhouyuanpeng
 * Created by  2019-08-06 16:35
 */

public class TestString02 {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "a"+"b"+"c";
        String str3 = new String("abc");
        String str4 = str3 + "";
        String str5 = new String("abc");

        //判断地址是否一致，地址相等是表示没有开空间
        //有变量参与运算
        //使用了关键字new

        System.out.println("str1==str2:"+(str1==str2)); //true
        System.out.println("str1==str3:"+(str1==str3)); //false
        System.out.println("str1==str4:"+(str1==str4)); //false
        System.out.println("str1==str5:"+(str1==str5)); //false

        //str3和str5在堆内存不是一个空间
        System.out.println("str3==str5:"+(str3==str5)); //false












    }


}
