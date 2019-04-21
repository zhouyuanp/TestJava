package MyPro03;

/**
 * Time:2019/4/18 23:54
 * 测试递归
 * @author zhouyuanpeng
 */
public class TestRecursion {
	public static void main(String[] args){
		long d1 = System.currentTimeMillis();  //返回当前时刻的毫秒数//时间戳
		System.out.printf("%d阶乘的结果:%s%n",10,factorial(10)); //字符串替换
		long d2 = System.currentTimeMillis();
		System.out.printf("递归费时:%s%n",d2-d1);

		factorialLoop(10);

	}
	/**求阶乘的方法*/
	static long factorial(int n){
		if (n == 1){  //递归头
 			return 1;
		}else { //递归体
			return n * factorial(n - 1); //n * (n-1)
		}
		//阶乘是指1*2*3*4*5*6*7....*10
	}
    //使用循环做

	static long factorialLoop(int a){
		long d3 = System.currentTimeMillis();
		long result =1 ;
		while (a > 1) {
			result *= a * (a-1);
			a -= 2; //a = a-2;
		}
		long d4 =System.currentTimeMillis();
		System.out.println(result);
		System.out.printf("普通循环耗时:%s%n",d4-d3);
		return result;
		}
	}












