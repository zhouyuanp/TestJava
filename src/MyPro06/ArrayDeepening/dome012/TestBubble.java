package src.MyPro06.ArrayDeepening.dome012;


import java.util.Arrays;

/**
 * @program: TestJava
 * @description: 冒泡排序
 * @author: zhouyuanpeng
 * Created by  2019-11-19 13:07
 */

public class TestBubble {
    public static void main(String[] args) {
        //数组
        int[]   array = {75,87,56,45,49};

        System.out.println("排序之前"+Arrays.toString(array));
        for (int i = 0 ; i<array.length-1;i++){  //比较轮数
            for (int j = 0;j<array.length-1;j++ ){
                //相邻的两个数比较
                if (array[j]>array[j+1]) {
                    //第三变量交换
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    }
                }

            }
        //排序之后的数组
        System.out.println("\n排序之后"+Arrays.toString(array));
        }




    }




