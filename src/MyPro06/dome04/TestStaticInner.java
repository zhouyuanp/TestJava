package src.MyPro06.dome04;

/**
 * @program: TestJava
 * @description: 测试静态内部类的访问
 * @author: zhouyuanpeng
 * Created by  2019-08-03 07:46
 */

public   class TestStaticInner {
    public static void main(String[] args) {
        //创建内部类的对象   new 外部类类名.内部类类名();

        Outer.Inner i = new Outer.Inner();
        i.show();

        //访问的是静态内部类中的静态方法

        Outer.Inner2.show();

    }
}
