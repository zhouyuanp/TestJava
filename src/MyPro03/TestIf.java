package MyPro03;
/**
 * Time:2019/4/7 14:27
 * 测试if单选择结构
 * @author zhouyuanpeng
 */
public class TestIf {
    public static void main(String[] args){
        double d = Math.random();    //产生一个[0,1)之间的随机数
        System.out.println(d);

        int i = (int)(6*Math.random()+1);
        System.out.println(i);
        if (i <= 3) {  //不加括号只执行1行代码
            System.out.println("小");
            System.out.println("xxxxx");
        }

        System.out.println("---------------------");
    //通过掷骰子来看看今天的手气如何
        int a = (int)(6*Math.random())+1;  //通过Math.random 产生随机数
        int b = (int)(6*Math.random())+1;
        int c = (int)(6*Math.random())+1;
        int count = a + b + c;
        System.out.println(count);

        //如果三个骰子之和大于15,则手气不错
        if (count>15){
            System.out.println("今天手气不错");
        }
        //如果三个骰子之和大于等于或者10小于等于15,则手气还好
        if (count >= 10 && count <= 15){
            System.out.println("手气还好");
        }
        //如果三个骰子之和小于10,则手气一般
        if (count < 10){
            System.out.println("手气一般");
        }



    }
}
