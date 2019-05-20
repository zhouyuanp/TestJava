package MyPro04;

/**
 * Time:2019/5/20 23:31
 * 类和对象和方法
 * @author zhouyuanpeng
 */
public class StxStu {

	int id;
	String name;
	int age;

	void stuld(){
		System.out.println("认真学是把不会的搞定");
	}
	void play(){
		System.out.println("有时间好好歇歇");
	}



	public static void main (String[] args){
		StxStu stu = new StxStu();
		stu.play();
	}
}
