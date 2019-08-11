package src.MyPro06.ObjectDeepening.dome04;

/**
 * @program: TestJava
 * @description: 测试访问成员内部类
 * @author: zhouyuanpeng
 * Created by  2019-08-03 07:11
 */

public class TestFace {


    public static void main(String[] args) {
        //创建脸的对象
        Face f = new Face();

        //创建鼻子的对象
        Face.Nose n = f.new Nose();

        //调用方法
        n.breath();
    }
}
