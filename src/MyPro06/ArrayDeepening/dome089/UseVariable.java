package src.MyPro06.ArrayDeepening.dome089;

/**
 * @program: TestJava
 * @description: 数组的变化
 * @author: zhouyuanpeng
 * Created by  2019-11-05 15:17
 */

public class UseVariable {
    public static void main(String[] args) {
        //创建 5 int的变量，保存 5 个学生的成绩
        int student12 = 55;
        int student23 = 66;
        int student34 = 77;
        int student45 = 88;
        int student56 = 99;
        //嘴高分初始分为0分
        int bestScore = 0;
        //如果当前学生的分数比记录中的最高分高，则当前学生的成绩为最高分，以下类同
        if (student12 >= bestScore){
            bestScore = student12;
        }
        if (student23 >= bestScore){
            bestScore = student23;
        }
        if (student34 >= bestScore){
            bestScore = student34;
        }
        if (student45 >= bestScore){
            bestScore = student45;
        }
        if (student56 >= bestScore){
            bestScore = student56;
        }
        System.out.println("最高分为："+bestScore);

        //数组的实现方式

        int studentCount = 5;
        int[] students;
        students = new int[5];






    }


}
