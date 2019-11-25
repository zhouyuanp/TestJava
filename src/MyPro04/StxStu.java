package src.MyPro04;

/**
 * Time:2019/5/20 23:31
 * 类和对象和方法
 * @author zhouyuanpeng
 */
public class StxStu {   //一个文件中只能有一个public 修饰的类

	int id;
	String name;
	int age;
    Computer comp; //comp 是对象

	void stuld(){
		System.out.println("认真学是把不会的搞定了,买"+comp.brand); //通过点. 来访问相关的属性
	}
	void play(){
		System.out.println("有时间好好歇歇");
	}

	//相当于StxStu的构造方法
	//通过构造方法来创建这个对象
	//构造方法,用于创建这个类的对象,无参的构造方法可以由系统自动创建
	//方法名和类名保持一致

	StxStu(){

	}

	public static void main (String[] args){//静态方法 在main 方法中创建了两个对象
		StxStu stu = new StxStu();  //new创建一个对象
		System.out.println(stu);  //打印对象地址
		stu.id = 1001;
		stu.name = "周元鹏";
		stu.age = 27;

		Computer c1 = new Computer();// main 方法的局部变量  //new 创建一个对象

		c1.brand = "苹果电脑";
		stu.comp = c1;
        stu.stuld();
		stu.play();
	}
}

class Computer{
	String brand;


}