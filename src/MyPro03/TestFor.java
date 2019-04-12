package MyPro03;

/**
 * Time:2019/4/12 8:36
 * 测试for循环
 * @author zhouyuanpeng
 */
public class TestFor {
	public static void main(String[] args){
		int sum = 0;
		for (int i = 1;i <= 100; i++ ){
			sum = sum + i;
		}
		//初始化值的作用域
	//	System.out.println(i); i 没有定义 i 在for循环里面
		/** 和while 一样
		 * 	int i = 1;
		 * 	int sum = 0;
		 * 	while (i<=100){
		 * 		sum = sum + i;
		 * 		i++;
		 *                }
		 */
		System.out.println(sum);
		/** 执行过程
		 * 1.执行初始化语句 i=1;
		 * 2.判断 i<=100;
		 * 3.执行循环体 先执行循环体
		 * 4.步进迭代 :i++
		 * 5. 回到第二步继续判断
		 *
		 */
		//测试多个初始化值和多个迭代  用逗号分开,
		for (int i = 1,j =i + 10;i < 5 ;i++,j = i * 2){
			System.out.println("i="+i+"j="+j);
		}
        //死循环
		for (;;){
			System.out.println("爱你到永远!!!! 积极主动的去面对 ");
		}



	}
}
