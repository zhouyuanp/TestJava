package MyPro03;
/**
 * Time:2019/4/21 17:04
 * 课后练习
 * 打印九九乘法表
 * @author zhouyuanpeng
 */
public class HomeWork {

	public static void main(String[] args){
		//打印九九乘法表
		for (int a = 1;a <10;a++){   //控制外循环的循环
			for (int b = 1;b <a+1 ;b++){   // 控制内循环b是a的循环体a+1不能写死10
				System.out.print(a+"*"+b+"="+(a*b)+"\t");  //字符串拼接和换行
			}
		System.out.println();//换行
		}
	}
}
