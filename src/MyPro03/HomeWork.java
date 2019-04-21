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

		//用 while 和 for 循环分别计算 100 以内奇数和偶数的和，并输出。
		System.out.println("用while循环100以内奇数和偶数的和");
		int a = 1;
		int sum1 = 0;
		int sum2 = 0;
		while (a <= 100){
			if (a%2==0){
				sum1=sum1+a;
			}else {
				sum2=sum2+a;
			}
			a++;   //自增
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println("用while循环100以内奇数和偶数的和");
		int sum01 = 0;
		int sum02 = 0;
		for (int i =0;i<=100;i++){
			if (i%2==0){
				sum01 +=i;
			}else {
				sum02 +=i;
			}
		}
		System.out.println(sum01);  //注意输出语句放到for循环的外面
		System.out.println(sum02);
	}
}
