package MyPro03;

/**
 * Time:2019/4/18 23:34
 *  测试递归
 * @author zhouyuanpeng
 */
public class TeatRecursion01 {

	public static void main(String[] args){
		a();

	}
	static int count = 0;  //定义了static 方法
	static void a(){
		System.out.println("a");
		//b();   //在a 方法中调用b方法
		//a(); //自己调自己会发生死循环直到占用完系统资源抛异常
		count++;
		if (count < 10){
			a();
		}else {
			return ;  //结束方法的运行和返回值
		}
	}
	static void b(){
		System.out.println("b");
	}
}
