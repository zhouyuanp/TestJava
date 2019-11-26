package src.MyPro06.Exception.dome015;

import java.util.Scanner;

/**
 * @program: TestJava
 * @description: 测试异常
 * @author: zhouyuanpeng
 * Created by  2019-11-23 14:20
 */

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int numA = input.nextInt();
        System.out.println("请输入除数：");
        int numB = input.nextInt();
        int result = numA/numB;
        System.out.println(numA+"/"+numB+"="+result);

    }
}
