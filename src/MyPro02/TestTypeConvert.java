package MyPro02;

/**
 * Time:2019/3/31 18:16
 * 测试自动类型转换  Convert转换
 * 容量小的向容量大的转化
 * @author zhouyuanpeng
 */
public class TestTypeConvert {
	public static void main(String[] args){
		int a =234;
		long b = a;
		double d = b;
		//a = b;  //b是long类型不能赋值给a

		//long e = 3.23F; //long类型的值不能转换给float
		float f = 234234L; //long类型的值可以转换给float

		//特例
		byte a1 = 123;

	}
}
/***
 * 测试强制类型转换
 * 需要单独运行a1
 */
class TestTypeConstraint  {
	public static void main(String[] args){
		double x = 3.14;
		int nx = (int)x;
		char c = 'a';
		int d = c+1;
		System.out.println(nx);
		System.out.println(d);
		System.out.println((char)d);

	}

}