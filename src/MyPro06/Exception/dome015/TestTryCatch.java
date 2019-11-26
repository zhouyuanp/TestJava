package src.MyPro06.Exception.dome015;

import java.util.Scanner;

/**
 * @program: TestJava
 * @description: 测试异常
 * @author: zhouyuanpeng
 * Created by  2019-11-23 14:20
 */

public class TestTryCatch {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入被除数：");
            int numA = input.nextInt();
            System.out.println("请输入除数：");
            int numB = input.nextInt();
            int result = numA / numB;
            System.out.println(numA + "/" + numB + "=" + result);
        }catch (Exception e){ //ArithmeticException e = new InputMismatchException();创建不成功不进入catch 中的代码中执行
        //}catch (Exception e){//相当于Exception e = new ArithmeticException() 多态的表示形式,父类的引用指向子类对象
            e.printStackTrace();
        }
     System.out.println("程序结束");


    }
}
