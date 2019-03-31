package MyPro02;

/**
 * Time:2019/3/31 22:20
 * 测试类型转换常见问题
 * @author zhouyuanpeng
 */
public class TestTypeConvertError {
	public static void main(String[] args){
		int money = 1000000000;
		int years = 20;
		//结果超出了int的表述范围导致溢出结果为负数
		int total = money*years;
		System.out.println(total);
		//返回的total依然是负数,默认为int,因此结果会转为int的值,再转成long类型,已经发生了溢出,数据已丢失
		//结果超出了int的表述范围导致溢出结果为负数
		//表达式已经溢出,再重新赋值也不行
		long total1 = money*years;
		System.out.println(total1);
		//返回的total2正确,先将一个变量(因子)变成long类型,整个表达式发生提升,全部用long来计算.
		//把一个变量做提升
		long total2 = money*((long)years);
		System.out.println(total2);
		//或者
		long total3 = 23*1244*1212211*12121232;
		long total4 = 23L*1244*1212211*12121232;//加L

		System.out.println(total3);
		System.out.println(total4);


		//命名问题
		int l = 2; //分不清是L还是1
		long a = 12343l; //建议使用大写L;
		System.out.println(l+1);

	}
}
