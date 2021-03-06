package src.MyPro06.ObjectDeepening.dome03;

/**
 * @program: TestJava
 * @description: 接口和实现类
 * @author: zhouyuanpeng
 * Created by  2019-07-31 16:57
 */


public interface Fly {
    public void flying(); //飞行的能力

}

/**
 * 飞机的实现类
 */
class AirPlane  implements Fly{    //类实现接口是实现接口的中的方法
    @Override
    public void flying() {
        System.out.println("飞机在天上飞行");
    }

}

/**
 * 鸟的实现类
 *
 */
class Bird implements Fly{

    @Override
    public void flying() {
        System.out.println("小鸟蓝天上飞行");

    }

}
/**
 * 足球的实现类
 *
 */
class FootBall implements Fly{

    @Override
    public void flying() {
        System.out.println("球被踢了一脚，飞进了对方的球门里");
    }
}
