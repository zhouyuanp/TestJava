package src.MyPro06.Exception.dome019;

import java.util.Scanner;

/**
 * @program: TestJava
 * @description: 自定义异常
 * @author: zhouyuanpeng
 * Created by  2019-12-03 12:50
 */

public class TestSexException {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的性别：");
        String gender = input.next();

        if ("男".equals(gender)||"女".equals(gender)){
            System.out.println("性别录入正确。");
        }else{
            try {
                throw new SexException("性别只能是男或者女");
            } catch (SexException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }




    }
}
