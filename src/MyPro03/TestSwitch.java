package MyPro03;

/**
 * Time:2019/4/9 23:01
 * 测试 Switch 语句
 *  遇到多值判断的时候,使用switch 语句 switch 完全可以使用if else if else 来代替
 * @author zhouyuanpeng
 */
public class TestSwitch {
	public static void main(String[] args){
		int month = (int)(12*Math.random()+1);
		System.out.println("月份:"+month);
		switch(month){
			case 1:
				System.out.println("1月份!");
				break;
			case 2:
				System.out.println("2月份!");
				break;
			default:
				System.out.println("我是其他月份!");
				break;
		}
        System.out.println("-------------------------------");

		char c = 'a';    // c = a
		int rand = (int)(26 * Math.random());
		char c2 = (char)(c + rand);  //c2 = a+17 char后转成char字符类型
		System.out.println(c);
		System.out.println(rand);
		System.out.print(c2 + ":");
		switch(c2){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("元音");
				break;
			case 'y':
			case 'w':
				System.out.println("半元音");
				break;
			default:
				System.out.println("辅音");
				break;

		}


	}

}
