package src.MyPro06.ArrayDeepening.dome01;



/**
 * @program: TestJava
 * @description: 二维数组的初始化和数
 * @author: zhouyuanpeng
 * Created by  2019-08-14 13:48
 */

public class TestArray2 {
    public static void main(String[] args) {
        //二维数组不是规则的矩阵
        int [] intA[] = {{1,2},{2,3,4},{3,4,5,6}};
        System.out.println(intA);

        //声明一个二维数组，用于存储3个一维数组，每一个一维数组存多少个数组，null
        int [][] intB = new int[3][];
        intB[0] = new int[3]; //3 0 0 0
        intB[1] = new int[]{1,2,3,4}; //4 1 2 3 4
        intB[2] = new int[2]; //2 0 0
       // intB[3] = new int[4];
        System.out.println(intB);

        //声明一个二维数组，同时创建出一维数组，每个一维数组的长度均相同
        //存储三个一维数组，每个一维数组的长度为4
        int []intC[] = new int[3][4];
        System.out.println(intC);




    }
}
