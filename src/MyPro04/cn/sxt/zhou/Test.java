package src.MyPro04.cn.sxt.zhou;

//import MyPro04.User; //表示导入了User 类
import src.MyPro04.cn.sxt.oo.*;// *表示导入oo下的所有的类
import src.MyPro04.cn.sxt.oo.User;

import java.util.Date;
//import java.sql.Date;
import static java.lang.Math.*;
public class Test {
    public static void main(String[] args){
        User user = new User();

        //测试重名的包
        java.util.Date date = new java.util.Date();
        //java.sql.Date date1 = new java.sql.Date();
        System.out.println(PI);

    }

}
