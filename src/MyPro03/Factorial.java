package MyPro03;

/**
 * Describe:
 * 使用递归算法完成阶乘：1!+2!+3!+4!+5!
 * 作业阶乘 循环和阶乘的结合
 * @author zhouyuanpeng
 * @date 2019/05/21
 */
public class Factorial {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1;i <=5 ; i++){
            sum = sum+Fact(i);   //循环是加1--5 阶乘的和
        }
        System.out.println(sum);
    }
    static int Fact(int n ){   //计算1-5阶乘的和
        if (n == 1){
            return 1;
        }else{
            return n * Fact(n - 1);
        }
    }




}
