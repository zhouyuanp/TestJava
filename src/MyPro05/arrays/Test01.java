package src.MyPro05.arrays;

/**
 * 数组的声明
 * 数组的初始化
 * 数组的遍历
 * @author zhouyuanpeng
 *
 */

public class Test01 {

    public static void main(String[] args){
        int[] arr01 = new int[10]; //只能放10个int变量  声明数组和给数组空间//索引的下标0-9
        String[] arr02 = new String[5];  //声明数组


      //  arr01[10] = 12; java.lang.ArrayIndexOutOfBoundsException: 10  //数组越界
        //通过循环初始化数组
        for (int i = 0; i < arr01.length; i++){
            arr01 [i] = 10*i;
        }
        //通过循环遍历读取数组中的元素
        for (int i = 0; i < arr01.length; i++){
            System.out.println(arr01[i]);
        }

        User[] arr03 = new User[3];
        arr03[0] = new User(1,"zhou");
        arr03[1] = new User(2,"yuan");
        arr03[2] = new User(3,"peng");
        //遍历数组的内容
        for (int z = 0; z < arr03.length;z++){
            System.out.println(arr03[z].getId());
            System.out.println(arr03[z].getName());
        }




    }
}
