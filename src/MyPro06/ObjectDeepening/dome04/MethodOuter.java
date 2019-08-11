package src.MyPro06.ObjectDeepening.dome04;

/**
 * @program: TestJava
 * @description:
 * @author: zhouyuanpeng
 * Created by  2019-08-03 09:23
 */

public class MethodOuter {

    //show 是 MethodOuter 成员方法
    public void show(){

        int a = 10; //方法中的局部变量
        // Inner 内部类相当于show 方法中的局部变量，使用范围只能在show 方法中
        class Inner{   //show 方法中的内部类 只能在方法中使用，出了方法没有意义
            public void fun(){
                System.out.println("a="+a);

            }

        }

        //创建内部类的对象

        new Inner().fun();
    }


}
