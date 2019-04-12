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
		/** 执行过程
		 * 1.执行初始化语句 i=1;
		 * 2.判断 i<=100;
		 * 3.执行循环体 先执行循环体
		 * 4.步进迭代 :i++
		 * 5. 回到第二步继续判断
		 *
		 */
	}
}
