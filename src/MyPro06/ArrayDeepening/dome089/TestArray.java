package src.MyPro06.ArrayDeepening.dome089;

/**
 * @program: TestJava
 * @description: 二维数组的初始化
 * @author: zhouyuanpeng
 * Created by  2019-08-13 21:19
 */

public class TestArray {


    public static void main(String[] args) {
        //数组可以存储基本数据类型和引用数据类型
        int [] arrA = {11,22,33}; //一维数组，引用数据类型

        //数据类型 [] 数组名  = new 数据类型[长度]

        System.out.println(arrA);
        //二维数组存储一维数组的数组
        int [][] arrB = new int[3][];

        //使用二维数组存储一维数组

        arrB[0] = arrA;
        System.out.println(arrB);


    }




}
