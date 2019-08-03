package src.MyPro06.dome04;

/**
 * @program: TestJava
 * @description: 内部类和外部类和静态内部类
 * @author: zhouyuanpeng
 * Created by  2019-08-03 06:46
 */

public class Outer { //外部类

    private static String name = "张三";

    /**
     * 静态内部类
     * 1 不允许访问外部类的非static属性
     * 2 如果内部类中的方法为static方法，那么内部类也必须是静态的
     */

    static class Inner{   //内部类
        public void show(){
            System.out.println(name);
        }

    }
    static class  Inner2{
        public static void show(){
            System.out.println("静态内部类");

        }
    }
}
