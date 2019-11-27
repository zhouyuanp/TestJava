package src.MyPro06.Exception.dome0151;
import java.util.Scanner;
/**
 * @program: TestJava
 * @description: 测试TryFinally
 * @author: zhouyuanpeng
 * Created by  2019-11-26 21:40
 */
public class TestTryFinally {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {

            System.out.println("请输入被除数：");
            int numA = input.nextInt();
            System.out.println("请输入除数：");
            int numB = input.nextInt();
            int result = numA / numB;
            System.out.println(numA + "/" + numB + "=" + result);
            //退出java虚拟机
            System.exit(0);
            System.out.println("到该行后不执行");
        }finally {
            System.out.println("finally 中的代码");
        }
    }
}