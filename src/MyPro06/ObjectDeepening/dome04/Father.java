package src.MyPro06.ObjectDeepening.dome04;

/**
 * @program: TestJava
 * @description: 匿名内部类
 * @author: zhouyuanpeng
 * Created by  2019-08-03 09:52
 */

public abstract class Father {  //父类
    public abstract void dream();   //父类的伟大梦想

}

class Son extends Father{ //子类是有名称的，子类的名称叫son


    @Override
    public void dream() {
        System.out.println("有名的类");

    }
}
class Test{
    public static void main (String[] args){
        //父类引用指向子类对象
        Father f = new Son(); //有名字的子类
        f.dream();
        /***
         * 匿名子类 没用名称的类
         *
         */

        Father f2 = new Father() {   //匿名内部类
            @Override
            public void dream() {
                System.out.println("努力实现父亲的梦想，带着父亲往前走。。。。");
            }
        };
        f2.dream();
    }
}