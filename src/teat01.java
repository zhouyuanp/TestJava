/**
 * Time:2019/5/5 8:20
 *
 * 测试重写和重载
 * @author zhouyuanpeng
 */
public class teat01 {
	public String a (String name, int age){
		return "abcd";
	}
	public String a (String name, int age, String address){
		return "1234";
	}
	public int a (String name){
		return 100000;
	}
	public int a (Long age){
		return 999;
	}
	public static void main(String[] args){

		A a = new A();
		A b = new B();
		System.out.println(a.a("aaa",11));
		System.out.println(b.a("aaa",12));

	}

}

class A {
	public String a (String name,int age){
		return "I am A";
	}
}
class B extends A{
	@Override
	public String a (String name,int age){
		return "I am B!!!";
	}

}

