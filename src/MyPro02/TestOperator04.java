package MyPro02;

/**
 * Time:2019/3/29 1:13
 * 位运算符
 * @author zhouyuanpeng
 */
public class TestOperator04 {

	public static void main (String[] args){
		int a = 3;
		int b = 4;
		System.out.println(a&b);  //与
		System.out.println(a|b);  //或
		System.out.println(a^b);  //异或
		System.out.println(~a);   //取反

		//移位
		int c = 3<<2;

		System.out.println(c);
		System.out.println(12>>2);

	}

}
