package src.MyPro06.ArrayDeepening.dome013;

import java.util.Arrays;

/**
 * @program: TestJava
 * @description: 冒泡排序的优化算法
 * @author: zhouyuanpeng
 * Created by  2019-11-20 08:00
 */

public class TestBubbleOptimize {

    public static void main(String[] args) {
        //数组
      //  int [] array1 = {75,87,56,45,49}; //无序数组
        int [] array1 = {1,2,3,4,5,6}; //有序数组

        System.out.println("排序之前："+Arrays.toString(array1));

        //冒泡排序的优化算法
        boolean flag;
        int count = 0;
        int temp ; //放到循环之外去声明 //无需新开空间了
        for (int i = 0 ;i<array1.length-1;i++){ //5个数，4次 N-1
            flag=true;  //默认有序
            count++; //统计比较的轮数
            //每轮比较的次数
            for (int j = 0 ;j<array1.length-1-i;j++){ //无需比较到数组的最后，只需要比较无需数列部分即可
                if (array1[j]>array1[j+1]){
                    //两两相比
                     temp = array1[j];
                    array1[j] = array1[j+1];
                    array1[j+1] = temp;
                    flag=false;//数据中的元素无序，发生了交换
                }
            }
            if (flag){
                break; //退出循环，证明数组有序
            }
        }
        //排序之后
        System.out.println("排序之后："+ Arrays.toString(array1));
        System.out.println("一共比较了"+count+"轮");

    }

}
