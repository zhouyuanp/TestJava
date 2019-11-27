package src.MyPro06.Exception.dome0151;

import java.util.Scanner;

/**
 * @program: TestJava
 * @description: 测试TryCatchFinally
 * @author: zhouyuanpeng
 * Created by  2019-11-26 21:51
 */

public class TestTryCatchFinally {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("请输入被除数：");
            int numA = input.nextInt();
            System.out.println("请输入除数：");
            int numB = input.nextInt();
            int result = numA / numB;
            System.out.println(numA + "/" + numB + "=" + result);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
            System.out.println("获取异常的字符描述"+e.getMessage());
            return ;
            //e.printStackTrace();//打印堆栈信息
        } finally {
            System.out.println("finally中的代码");
        }

    }
}


