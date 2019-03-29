package MyPro02;

/**
 * Time:2019/3/29 8:23
 * 测试字符串连接符
 * @author zhouyuanpeng
 */
public class TestOperator05 {

	public static void main(String[] args){
		String a = "3";
		int b = 4;
		int c = 5;
		char d = 'a';  //表示字符  a 在阿斯克码表示数字97
		System.out.println(a+b);
		System.out.println(a+c);  //表示字符串连接符  得到最后的结果也是字符串
		System.out.println(b+c);  //数字9 + 号变成加法
		System.out.println(a+b+c);  //得到345
        System.out.println(b+c+a);  //得到93  先算b+c=9 在连接3
		System.out.println(c+d);  //d 表示97
	}

}
