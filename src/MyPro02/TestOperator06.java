package MyPro02;

/**
 * Time:2019/3/29 8:42
 * 测试条件运算符(三元运算符)
 * @author zhouyaunpeng
 */
public class TestOperator06 {
	public static void main(String[] args){

		int score = 80;
		int x = -100;

		String type = score<60?"不及格":"及格";  // "不及格":"及格" 可以为任意类型不只是字符串
		System.out.println(type);
		if (score>60){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
		System.out.println(x>0?1:(x==0?0:-1));
	}
}
