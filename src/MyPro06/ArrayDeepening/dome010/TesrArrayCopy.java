package src.MyPro06.ArrayDeepening.dome010;

public class TesrArrayCopy {
    public static void main(String [] args){
        int [] arrA = {11,12,13,14};
        //创建一个数组
        int [] arrB = new int[5];
        System.out.println("拷贝地址(引用)之前");
        System.out.println("arrA = "+arrA);
        System.out.println("arrB = "+arrB);

        //引用拷贝
        arrB=arrA;
        System.out.println("拷贝地址(引用)之后");
        System.out.println("arrA = "+arrA);
        System.out.println("arrB = "+arrB);

    }

}
