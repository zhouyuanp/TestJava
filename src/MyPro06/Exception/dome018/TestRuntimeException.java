package src.MyPro06.Exception.dome018;

import java.util.Scanner;

/**
 * @program: TestJava
 * @description: 常见的异常类型
 * @author: zhouyuanpeng
 * Created by  2019-12-02 20:02
 */

public class TestRuntimeException {

    public static void main(String[] args) {
        //1.算数异常
        int b = 0;
        if (b!= 0){
            int result = 1/b;
        }else{
            System.out.println("除数不能等于0");
        }

        //2.空指针异常,没有创建对象（new）而调用了对象的属性或方法
        String str = null;
        if (str!=null){
            System.out.println(str.length());
        }

        //3.类型转换异常，将某个对象转换类型的时候出现的异常
        Animal dog = new Dog(); //想上类型转换
        if (dog instanceof Cat){
            Cat c = (Cat)dog; //向下类型转换，转换成真实的子类对象
        }
        //4. 数组下标越界,数组的索引超出边界的异常
        int []arr = {1,2,3};
        int index = 3; //判断 index 的值与数组下标的值
        if (index < arr.length-1){
            System.out.println(arr[index]);
        }else{
            System.out.println("数组的下标超出边界");
        }

        //5.期望的数据类型与实际输入类型不匹配
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()){   //boolean --->true ,false
            int a = input.nextInt();
            System.out.println(a);
        }else {
            System.out.println("实际输入类型与期望的数据类型不匹配");
        }


    }
}



class Animal{

}
class Dog extends Animal{

}

class Cat extends Animal{

}