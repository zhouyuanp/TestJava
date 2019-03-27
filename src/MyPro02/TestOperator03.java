package MyPro02;

/**
 * Time:2019/3/27 23:23
 * 测试逻辑运算符
 * @author zhouyuanpeng
 */
public class TestOperator03 {
	public static void main(String[] args){

		boolean b1 = true;
		boolean b2 = false;
		//测试与
		System.out.println(b1&b2);
		System.out.println(b1|b2);
		System.out.println(b1^b2);
		System.out.println(!b2);

		//短路
		//int c = 3/0;  //被除数不等于0
		//boolean b3 = 1>2&2<(3/0); 与 计算了3/0
		boolean b3 = 1>2&&2<(3/0);//短路与，第一个操作数的值为false，则不需要再计算后面的操作数
		System.out.println(b3);




	}





}
