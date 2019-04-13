package MyPro03;

/**
 * Time:2019/4/13 16:39
 *
 * @author zhouyuanpeng
 */
public class TestContinue {
	//把100-150之间的能被3整数的数输出,每行输出5个
	public static void main(String[] args){
		int count = 0; //定义计数器
		for (int i = 100;i <= 150;i++){
			//如果是3的倍数,则跳过本次循环,继续下一次循环
			if (i % 3 == 0){
				continue;
			}
            //输出不是3的倍数的数
			System.out.print(i + ",");
			count++; //每输出一个数,计数器加1
			//根据计数器判断每行是否已经输出了5个数
			if (count % 5 == 0){
				System.out.println();
                count = 0; //可加可不加
			}

		}

	}


}
