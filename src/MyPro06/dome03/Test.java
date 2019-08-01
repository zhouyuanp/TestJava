package src.MyPro06.dome03;

/**
 * @program: TestJava
 * @description: 接口的调用和运行结果
 * @author: zhouyuanpeng
 * Created by  2019-07-31 17:08
 */

public class Test {
    public static void main(String[] args) {
        //接口类型（引用数据类型）指向实现类的对象
        //指向实现类  接口名 指向接口中的方法
        Fly airPlane = new AirPlane();
        Fly bird = new Bird();
        Fly football = new FootBall();

        //调用相同的方法
        airPlane.flying();
        bird.flying();
        football.flying();
        bird.flying();

        //运行结果，不相同，体现了多态的特征


    }
}
