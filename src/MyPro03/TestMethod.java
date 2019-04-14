package MyPro03;

/**
 * Time:2019/4/14 20:30
 * 测试方法的基本使用
 * @author zhouyuanpeng
 */
public class TestMethod {
	public static void main(String[] args){

		TestMethod tm = new TestMethod();


		int c1 =  tm.add(30,40,50)+1000;  //实参   //把整体当做一个int类型
		System.out.println(c1);
		tm.printzhuanzhuan();

	}
	void printzhuanzhuan(){
		System.out.println("珍惜转转这个平台");
		System.out.println("加油好好干");
		System.out.println("加油好好学");
		System.out.println("好好学就是牢固掌握自己所学的技术或技能,把握重点分清主次");
		System.out.println("好好干是指把工作完整,做的认真,把工作需要学习的理解透,能给不懂的人讲明白");
	}
	int add(int a,int b,int c){   //形参
		int sum = a + b + c;
		System.out.println(sum);
		return sum; //return 的作用 :1.结束方法的运行2. 返回值
	}
}
