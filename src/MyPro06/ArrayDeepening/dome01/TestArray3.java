package src.MyPro06.ArrayDeepening.dome01;

/**
 * @program: TestJava
 * @description: 数组的遍历
 * @author: zhouyuanpeng
 * Created by  2019-08-14 18:24
 */

public class TestArray3 {
    public static void main(String[] args) {
        //二维数组

        int [] intA[] = {{1,2},{2,3,4},{3,4,5,6}};
        //1.普通for循环

        for (int i = 0;i<intA.length;i++ ){   //0，1，2
            for (int j = 0; j<intA[i].length;j++){  //每一个一维数组的长度
                System.out.print(intA[i][j]+"\t");
            }
            System.out.println();
        }

        //2.加强for循环
        System.out.println("--------------------");
        for (int[] arr:intA){  //int[]二维数组中元素的类型，arr迭代变量，intA二维数组的名称
            for (int i:arr){ //int 一维数组中元素的类型，i ，迭代变量，arr 一维数组的名称

                System.out.print(i+"\t");
            }
            System.out.println();

        }

        //3.普通for循环+加强for循环
        System.out.println("---------------------");
        for (int [] arr:intA){ //加强for
            for (int i = 0;i<arr.length;i++){ //普通for
                System.out.print(arr[i]+"\t");
            }

            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = 0;i<intA.length;i++){
            for (int j:intA[i]){ //加强for
                System.out.print(j+"\t");
            }
            System.out.println();

        }








    }



}
