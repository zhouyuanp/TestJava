package src.MyPro06.CommonClasses.dome23;

/**
 * @program: TestJava
 * @description: 测试 StringBuilder 的扩容
 * @author: zhouyuanpeng
 * Created by  2019-12-13 20:28
 */

public class TestStringBuilder2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //实际上创建了一个长度为16的char 类型的数组
        StringBuilder sb2 = new StringBuilder("hello");
        //5+16
        sb2.append("world");
        sb2.append("world");
        sb2.append("world");
        sb2.append("world");
        System.out.println(sb2); //会自动扩容，使用的是数组的拷贝 (5+16)*2+2
        System.out.println("容量" + sb2.capacity() + "\t sb2 的长度" + sb2.length());

    }
}
