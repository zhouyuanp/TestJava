package MyPro03;
/**
 * Time:2019/4/21 17:04
 * 课后练习
 * 打印九九乘法表
 * @author zhouyuanpeng
 */
public class HomeWork {

	public static void main(String[] args){
		Multiplication();
		While01();
		Integral();
		Sigma();
		Random();
		Graph();

	}
	private static void Multiplication() {
		    //打印九九乘法表
			for (int a = 1;a <10;a++){   //控制外循环的循环
				for (int b = 1;b <a+1 ;b++){   // 控制内循环b是a的循环体a+1不能写死10
					System.out.print(a+"*"+b+"="+(a*b)+"\t");  //字符串拼接和换行
				}
				System.out.println();//换行
			}
		}
	private static void While01(){
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
			if (i % 2 == 0){
				sum01 += i;
			}else {
				sum02 += i;
			}
		}
		System.out.println(sum01);  //注意输出语句放到for循环的外面
		System.out.println(sum02);
	}
	private static void Integral(){
	    //用 while 和 for 循环输出 1-1000 之间能被 5 整除的数，且每行输出 3 个
		System.out.println("用 for 循环输出 1-1000 之间能被 5 整除的数");
		for (int i = 1;i <1000;i++){
			if (i%5==0){
				System.out.print(i+"\t");
			}
			if (i%25==0){
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("用 while 循环输出 1-1000 之间能被 5 整除的数"+"\t");
		int a =1;
		while (a<1000){
			if (a%5==0){
				System.out.print(a+"\t");
			}
			if (a%25==0){
				System.out.println("\t");
			}
			a++;
		}
}


    public static void Sigma(){
		//编程求和：
	    //∑1+∑2+∑3+……+∑100
	    //=1 +（1+2）+（1+2+3）+（...）+（1+2+3+4+5+…+100）
		System.out.println("");
	    int sum = 0;
	    for (int i = 1; i <= 100; i++) {
		    for (int j = 1; j <= i; j++) {
			    //sum += j;
			    sum = sum +j;
		    }
	    }
	    System.out.println("∑1+∑2+...+∑100=" + sum);
    }

    //生成 0-100 随机数，直到生成 88 为止，停止循环！
	public static void Random(){
		while (true) {   //循环输出
			int i  = (int)Math.round(Math.random()*100);    //需要把数据转换成int(正整数)
			System.out.println(i);
			if (i == 88){ //判断等于88时候结束
				System.out.println("生成随机数88,结束循环");
				break;
			}
		}
	}
    //打印出实心 10*10 正方形、空心 10*10 正方形
	public static void Graph() {
		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			for (int i = 1; i <= 10; i++) {
				System.out.print("*  ");
				sum++;
				if (sum % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("打印出实心 10*10 正方形");

		for (int i = 1; i <= 10; i++) {// 输出10行
			for (int j = 1; j <= 10; j++) {// 每行行10个*号
				if (i == 1 || i == 10) {// 判断是不是第1行或者第10行，对应正方形的定边和底边
					System.out.print("* ");// 输出*构成边
				} else {
					if (j == 1 || j == 10) {// 判断是不是第1列或第10列，对应正方形的左侧边和右侧边
						System.out.print("* ");// 输出*构成边
					} else {
						System.out.print("  ");// 其余输入空格，构成空性正方形
					}
				}
			}
			System.out.println();
		}
		System.out.println("打印出空心 10*10 正方形");

	}
}





