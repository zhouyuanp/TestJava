package src.MyPro06.Exception.dome017;

/**
 * @program: TestJava
 * @description: 测试throw 异常 手动抛出异常
 * @author: zhouyuanpeng
 * Created by  2019-11-28 20:15
 */

public class TestThrow {

    public static void show(){

        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        show();
    }
}
