package MyPro03;

/**
 * Time:2019/4/15 23:19
 * 测试方法的重载
 * @author zhouyuanpeng
 */
public class TestOverload {

	public static void main(String[] args){
		System.out.println(add(3,4));
		System.out.println(add(3,4,5));
		System.out.println(add(1.2,3));
		System.out.println(add(3,4.7));
		//见过的重载方法
		System.out.println(); //0个参数
		System.out.println(1);//参数是1个int
		System.out.println(3.0);//参数是1个double


	}
/**
	// 编译错误:只有返回值不同,不构成方法的重载  返回类型double
	public static double add(int n1,int n2){
		double sum = n1 + n2;
		return sum;
	}

	// 编译错误,只有参数名称不同,不够成方法的重载  参数名称不一样
	public static int add(int n2,int n1){
		double sum = n1 + n2;
		return sum;
	}
	**/
	//求和的方法
	public static int add(int n1,int n2){
		int sum = n1 + n2;
		return sum;
	}
	//方法名相同,参数个数不同,构成重载
	public static int add(int n1,int n2,int n3){
		int sum = n1 + n2 + n3;
		return sum;

	}
	//方法名相同,参数类型不同,构成重载
	public static double add(double n1,int n2){
		double sum = n1 + n2;
		return sum;
	}
	//方法名相同,参数顺序不同,构成重载
	public static double add(int n1,double n2){
		double sum = n1 + n2;
		return sum;
	}

}
