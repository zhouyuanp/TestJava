package MyPro02;

/**
 * Time:2019/3/26 23:30
 * 测试关系运算符
 * @author zhouyuanpeng
 */
public class TestOperator02 {
	public static void main(String[] args){
		int a = 3;
		System.out.println(a==3);
		System.out.println(a!=3);
		System.out.println(a<5);

		char b = 'a';
		char b2 = 'c';  //把a和c变成数字去比较
		System.out.println((int)b); //强制转型第一种方式
		System.out.println(0+b);
		System.out.println(0+b2);//强制转型第二种方式
		System.out.println(b<b2);





	}
}
