package src.MyPro06.Exception.dome017;

import java.io.File;
import java.io.IOException;

/**
 * @program: TestJava
 * @description: 测试继承关系的声明异常
 * @author: zhouyuanpeng
 * Created by  2019-11-28 19:43
 */

public class Father {
    public void show()throws Exception{

    }

    public void method() {//throws IOException   //在父类添加异常

    }

    public void fun(){  //子类重写该方法

    }
}

class Son extends Father{
    @Override
    public void show(){
        try {
            super.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Override
    public void method() {
        File f = new File("D:\\a.txt");

        try {  //在子类添加try catch
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void fun() throws RuntimeException{

        super.fun();//重写父类方法
    }
}