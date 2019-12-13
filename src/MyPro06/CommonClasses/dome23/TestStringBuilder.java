package src.MyPro06.CommonClasses.dome23;

/**
 * @program: TestJava
 * @description: 测试StringBuilder 常用方法
 * @author: zhouyuanpeng
 * Created by  2019-12-13 20:14
 */

public class TestStringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

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