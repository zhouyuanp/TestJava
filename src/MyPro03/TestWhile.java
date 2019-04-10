package MyPro03;

/**
 * Time:2019/4/11 1:14
 * 测试while循环
 * @author zhouyuanpeng
 */
public class TestWhile {
	public static void main(String[] args){
		//计算1+2+3+....+100的累加的和 5050
		int i = 1;
		int sum = 0;
		while (i<=100){
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}
}
