package src.MyPro06.ArrayDeepening.dome014;

import java.util.Arrays;

/**
 * @program: TestJava
 * @description: 测试二分法
 * @author: zhouyuanpeng
 * Created by  2019-11-21 22:00
 */

public class TestBinarySearch {
    public static void main(String[] args) {

        int [] arr = {5,13,19,21,37,56,64,75,80,85,88,92};
        System.out.println(Arrays.binarySearch(arr,21));  //返回索引下标
        //没找到时 插入点：要找的值在数组中不存在，如果存在的话，放在数组中应该处的位置。应该插入的位置80和88之间
        System.out.println(Arrays.binarySearch(arr,85)); //-10 -的插入点-1

        int low = 0; //开始位置
        int high = arr.length-1; //结束位置 数组的长度-1  //数组是奇数 -1 数组是偶数不-1 high 的值
        int key = 85;
        boolean flag = false; //循环结束还没找到

        while (low<high){
            //求中间索引
            int mid = (low+high)/2; //mid 位置为（开始位置+结束位置）/2

            if (arr[mid]>key){  //中间值>key（要找的值）
                high = mid-1;  //中间值-1
            }else if (arr[mid]<key){// 中间值<key（要找的值）
                low = mid+1; //起点为中间值+1
            }else{
                System.out.println(mid);
                flag = true; //找到之后值标记为true
                break; //找到之后退出循环
            }
        }
        if (!flag){
            System.out.println(-(low+1));
        }
    }
}
