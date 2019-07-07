package src.MyPro05.arrays;

/***
 * 数组的三种初始化方式
 * 静态初始化
 * 动态初始化
 * 默认初始化
 * @author zhouyuanpeng
 */

public class Test02 {
    public static void main(String[] args){
        //静态初始化
        int [] a = {1,2,3};
        User [] b = {
                new User(1,"wa"),
                new User(2,"ha"),
                new User(3,"ha")

        };
        for (int i = 0;i<b.length;i++){
            System.out.println(b[i].getName());
            System.out.println(b[i].getId());


        }
        //默认初始化 //默认给数组元素进行赋值，赋值的规则和成员变量的默认赋值规则一致
        int [] a2 = new int[3]; //默认：00
        boolean [] b2 = new boolean[2]; //默认：false
        String [] c2 = new String[3];//默认： null

        //动态初始化
        int [] a3 = new int[3];
        a3[0] = 1; //给数组元素赋值
        a3[1] = 2; //给数组元素赋值


    }


}
