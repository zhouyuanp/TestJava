package MyPro03;

/**
 * Time:2019/4/13 0:02
 * 测试嵌套循环
 * @author zhouyuanpeng
 */
public class TestwhileNect {
	public static void main(String[] args){
		for (int i = 1; i <= 5; i++ ){
			for (int j = 1;j <= 5;j++){
				System.out.print(i + "\t");
			}
			System.out.println();
		}

 System.out.println("-----------------------------------------------------");
		//九九乘法表
		for (int b = 1;b <= 9;b++){
			for (int a = 1;a < b+1;a++){
				System.out.print(a+"*"+b+"="+(a*b)+"\t");
			}
			System.out.println();  //用于换行
		}
		//计算出1--100 之间的偶数和和奇数和
		int sum1 = 0;
		int sum2 = 0;
		for (int c = 0; c <= 100;c++){
			if (c % 2 == 0) { //偶数    //if else 语句是循环体
				sum1 += c ; //sum1 = sum1 + c;
			}else{ //奇数
				sum2 += c;
			}

		}
		System.out.println("奇数的和:"+sum2);
		System.out.println("偶数的和:"+sum1);
 System.out.println("------------------------------");
 //用while 循环或者其他循环输出1-1000 之间的能被5整除的数,且每行输出5个
		int a1 = 0;
		for (int i = 1; i<=1000; i++){
			if (i%5==0){
				System.out.print(i+"\t");
				a1++;
			}
			if (a1==5){  //计时器 每5个换一次行
				System.out.println();
				a1=0;
			}
		/**	if (i%25==0) {   //每是25的倍数换一行
				System.out.println();
			}
         */
		}



	}

}
