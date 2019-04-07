package MyPro03;

/**
 * Time:2019/4/8 0:22
 * 测试if else 双选择结构
 * @author zhouyuanpeng
 */
public class TestIfElse {

	public static void main(String[] args){
		int h = (int)(6*Math.random()+1);
		System.out.println(h);
		if (h<=3){
			System.out.println("小");
		}else{
			System.out.println("大");
		}
    System.out.println("-------------------------------");
    //随机产生一个[0.0,4.0)区间的半径,并根据半径的求圆的面积和周长
		double r = 4*Math.random();//random[0,1)
		double area = Math.PI*Math.pow(r,2); //r的2次方
		double circle = 2*Math.PI*r;
		System.out.println("半径为:"+r);
		System.out.println("面积为:"+area);
		System.out.println("周长为:"+circle);
	//如果面积大于周长,则返回面积大于周长,否则,输出周长大于面积
		if (area >= circle){
			System.out.println("面积大于周长");
		}else{
			System.out.println("周长大于面积");
		}

	}


}
