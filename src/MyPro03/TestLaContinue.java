package MyPro03;

/**
 * Time:2019/4/14 9:15
 * 测试带标签的Break和 Continue
 * @author zhouyuanpeng
 */
public class TestLaContinue {
	public static void main(String[] args){
		//打印100-150之间的质数 质数是指只能被1和他自己本整除的数
		outer:for (int i = 101;i < 150;i++){  //i的取值范围101--149
			for (int j = 2;j < i/2;j++){ //j的取值范围2--74
				if (i % j == 0){  //  i=101--149 / j=2--74 == 0 时则继续循环外部循环 并不要能等于0的数
					continue outer ;
				}
			}
			System.out.println(i+" ");
		}
	}
}
