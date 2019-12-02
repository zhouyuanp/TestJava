package src.MyPro06.Exception.dome018;

import java.io.File;
import java.io.IOException;

/**
 * @program: TestJava
 * @description: 检查时异常
 * @author: zhouyuanpeng
 * Created by  2019-12-02 20:52
 */

public class TestCheckedException {
    public static void main(String[] args) {
        //检查时异常，N多个程序在编译期间必须处理的异常的总称
        File f = new File("D:\\a.txt");
        try {
            f.createNewFile();//在D盘创建一个名称为a.txt 的文件
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
