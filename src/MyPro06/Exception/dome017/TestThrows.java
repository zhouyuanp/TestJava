package src.MyPro06.Exception.dome017;

/**
 * @program: TestJava
 * @description:
 * @author: zhouyuanpeng
 * Created by  2019-11-28 15:40
 */
public class TestThrows{

    public static void show()throws Exception{

    }
    public static void Mathod()throws RuntimeException{

    }

    public static void main(String[] args) {// throws Exception{

        //调用本类的中静态方法show()
        try {
            show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Mathod(); //主方法区调用
    }


}