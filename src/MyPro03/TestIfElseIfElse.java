package MyPro03;

/**
 * Time:2019/4/8 23:35
 * 测试ifelse ifelse 多选择结构
 * @author zhouyuanpeng
 */
public class TestIfElseIfElse {
	public static void main(String[] args){
		int age = (int)(100*Math.random());
		System.out.print("年龄是"+age+",属于");
		if (age < 15){
			System.out.println("小孩子,喜欢玩");
		}else if (age < 25){
			System.out.println("小伙子,要学习");
		}else if (age < 35){
			System.out.println("大小伙子,要认真工作");
		}else if (age < 45){
			System.out.println("老大不小了,要好好照顾家庭");
		}else if (age < 65){
			System.out.println("老了,该享清福了");
		}else if (age < 85){
			System.out.println("时光飞逝,几十年过得好快");
		}else{
			System.out.println("人生苦短,好好珍惜,良好的事业追求和生活习惯");
		}

	}

}
