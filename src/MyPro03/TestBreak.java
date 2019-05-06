package MyPro03;

/**
 * Time:2019/4/13 15:29
 * 测试 break 和 continue 结束循环
 * @author zhouyuanpeng
 */
public class TestBreak {
	public static void main(String[] args){
		int total = 0; //定义计数器
		System.out.println("Begin");
		while(true){
			total++; //每循环一次计数器加1
			//Math.round()是对参数四舍五入
			int i = (int)Math.round(100 * Math.random()); //需要round取值类型float和double转换为int
			System.out.println(i);
			//当等于88时退出循环
			if ( i == 88 ){
				break;

			}
		}
		//输出循环的次数
		System.out.println("Game over , used " + total +"times.");
	}
}
