package MyPro03;

/**
 * Describe:
 * 打印实心正方形和空心正方形
 * @author zhouyuanpeng
 * @date 2019/05/20
 */
public class PrintSquare {
    public static void main (String[] args) {
        Solid();
        Hollow();
    }
        public static void Solid(){  //实心
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

        }
        public static void Hollow(){ //实心
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
