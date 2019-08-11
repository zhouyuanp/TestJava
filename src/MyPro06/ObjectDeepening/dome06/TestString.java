package src.MyPro06.ObjectDeepening.dome06;

/**
 * @program: TestJava
 * @description:  测试 String 类的构造方法
 * @author: zhouyuanpeng
 * Created by  2019-08-06 16:35
 */

public class TestString {
    public static void main(String[] args){
        String str = "apple";
        String str2 = "banana";
        String str3 = "cat";
        String str4 = "dog";
        String str5 = "app";

        // 比较大小
        //求两个字符串的长度的最小值,使用循环,比较对应位置上的字母,如果不相同,则对应位置字母的ASCII值相减
        System.out.println(str.compareTo(str2)); //-1
        System.out.println(str.compareTo(str3)); //-3
        System.out.println(str.compareTo(str4)); //-3
        //两个字符串的长度相差 5-3 = 2
        System.out.println(str.compareTo(str5)); //2
        /**
         * String 类的构造方法
         * */
        String s1 = new String(); //创建了一个长度为0的字符串
        String s2 = null; // 没有创建对象，只是声明了String类型的对象s2
        String s3 = new String("hello");


        //通过char类型的数组构造String对象
        char [] c = {'a','b','c'};
        String s4 = new String(c);

        //通过byte类型的数组构造String对象

        byte [] b = {97,98,99};
        String s5 = new String(b);

        String s6 = new String(c,0,2);
        System.out.println("s6:"+s6);

        String s7 = new String(b,1,2);
        System.out.println("s7:"+s7);
















    }
}
