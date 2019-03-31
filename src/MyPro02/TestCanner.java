package MyPro02;
import java.util.Scanner;

/**
 * Time:2019/3/31 23:56
 * 测试获得键盘输入
 * @author zhouyuanpeng
 */
public class TestCanner {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in); //io流对象
		System.out.println("请输入名字:");
		String name = scanner.nextLine(); //请输入这一行的文字
		System.out.println("请输入你的爱好:");
		String favor = scanner.nextLine();
		System.out.println("请输入你的年龄:");
		int age = scanner.nextInt();

		System.out.println("-----------------");
		System.out.println(name);
		System.out.println(favor);
		System.out.println("来到地球的天数:"+age*365);
		System.out.println("离家地球的天数:"+(72-age)*365);
		System.out.println("时间有限,抓紧学习,努力挣钱,让自己和家人过得舒服,挣钱娶妻子");


	}


}
