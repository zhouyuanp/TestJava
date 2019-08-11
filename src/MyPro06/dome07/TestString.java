package src.MyPro06.dome07;

/**
 * @program: TestJava
 * @description: 字符串相等判断
 * @author: zhouyuanpeng
 * Created by  2019-08-11 17:39
 */

public class TestString {

    public static void main(String[] args) {
        String str = "abc";
        String str2 = new String("abc");

        //对象地址不同

        System.out.println("两个对象的内存地址是否相等:"+(str==str2)); //false

        //比较对应位置上的字符是否相等，如果对象位置上的字符相等，返回true，否则返回false
        System.out.println("两个对象的内容是否相等:"+(str.equals(str2))); //ture  //str2 向上转型 object类型

        //类型不一致返回false
        //因为Person 对象instanceof String 的结果为 false ，则返回false
        System.out.println("Person 类中的内容是否相等:"+(str.equals(new Person()))); //Person 向上转型 object类型
    }

}
class Person{

}
