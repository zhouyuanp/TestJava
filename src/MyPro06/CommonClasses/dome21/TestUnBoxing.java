package src.MyPro06.CommonClasses.dome21;

/**
 * @program: TestJava
 * @description: 测试自动拆箱
 * @author: zhouyuanpeng
 * Created by  2019-12-06 10:53
 */

public class TestUnBoxing {
    public static void main(String[] args) {

        //基本数据类型  =  对象
        //相当于new Integer(100).intValue();
        int a = new Integer(100);

        Integer b = null;
        int c = b; //自动拆箱
        //相当于
        int cc =b.intValue();
        System.out.println(cc);





    }
}
