package src.MyPro06.ObjectDeepening.dome05;

/**
 * @program: TestJava
 * @description: 测试 String 和 String 使用方法 关注参数和结果
 * @author: zhouyuanpeng
 * Created by  2019-08-04 18:32
 */

public class TestString {
    public static void main(String[] args) {
        String str = "abc"; //声明了一个String 类型的变量，值为"abc";
        System.out.println(str);
        //String 类相当于char类型的数组，数组的长度一旦创建不能更改，value的数组还使用了final来修饰
        /***
         * String 类的常用方法
         */
        // charAt 获取字符串指定索引上的字符
        System.out.println(str.charAt(0)+"\t"+str.charAt(1)+"\t"+str.charAt(2));
        // equalsIgnoreCase 忽略字符串大小写比较，返回值是布尔类型
        System.out.println(str.equalsIgnoreCase("ABC"));
        // indexOf 查找指定字符串出现的位置 找到返回索引，找不到返回-1
        System.out.println(str.indexOf("b")+"\t"+str.indexOf("k"));
        // str.indexOf('b') 叫自动类型转换，自动将char--->int
        System.out.println(str.indexOf(98)+"\t"+str.indexOf("b"));

        // lastIndexOf 反向搜索

        String str2 = "helloworld";
        System.out.println(str2.indexOf("o")+"\t"+str2.lastIndexOf("o"));
        System.out.println(str2.indexOf("o",5)+"\t"+str2.lastIndexOf("o",3)+"\t"+str2.lastIndexOf("o",7));  //7代表结束位置


        // length 字符串中字符的个数
        System.out.println("字符的个数是="+str2.length());

        // replace 老的需要新的替换，原字符串不被改变
        System.out.println(str2.replace("o","P"));
        System.out.println(str2);  //字符串不能被改变只能共享

        // startsWith 如果字符串以什么开头的开始，则返回ture
        System.out.println(str2.startsWith("hell"));

        // endsWith 如果字符串以什么结尾，则返回ture
        System.out.println("Io.java".endsWith(".java"));
        System.out.println(str2.endsWith("c"));

        // substring 截取字符 含头不含尾
        System.out.println(str2.substring(3)); //一直截取到字符串的结尾
        System.out.println(str2.substring(3,7)); //含头不含尾
        System.out.println(str2);

        // toLowerCase 字符串大写转小写 toUpperCase 小写转大写

        System.out.println("JAVA".toLowerCase()+"\t"+"java".toUpperCase());

        // trim 去除字符串前后的长度
        String str3 = "   hello   world   ";
        System.out.println(str3.length()+"\t"+str3.trim().length());
        System.out.println(str3);

        //值不改变，只改变引用关系
        String str4 = str3.trim();
        System.out.println(str4);









    }



}
