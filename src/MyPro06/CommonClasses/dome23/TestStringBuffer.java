package src.MyPro06.CommonClasses.dome23;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @program: TestJava
 * @description: 测试 StringBuffer
 * @author: zhouyuanpeng
 * Created by  2019-12-13 20:44
 */

public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        StringBuffer sb1 = new StringBuffer();
        //实际上创建了一个长度为16的char 类型的数组
        StringBuffer sb2 = new StringBuffer("hello");
        //5+16
        sb2.append("world");
        sb2.append("world");
        sb2.append("world");
        sb2.append("world");
        sb2.append("world");
        sb2.append("world");
        sb2.append("world");
        sb2.append("world");

        System.out.println(sb2); //会自动扩容，使用的是数组的拷贝 (5+16)*2+2
        System.out.println("容量" + sb2.capacity() + "\t sb2 的长度" + sb2.length());

        System.out.println("------------------------");



        //字符串的追加
        sb.append("hello");
        sb.append(true);
        sb.append("你");
        sb.append(100);
        System.out.println(sb.toString());

        //删除，含头不含尾
        sb.delete(3,5);
        System.out.println(sb.toString());

        //删除指定位置上的字符
        sb.deleteCharAt(1); //位置为1的
        System.out.println(sb);

        //给指定位置添加的字符
        sb.insert(2,'好');
        System.out.println(sb);

        //查找字符，找到返回索引，找不到返回 -1
        System.out.println(sb.indexOf("t") + "\t" + sb.indexOf("k"));



    }
}
