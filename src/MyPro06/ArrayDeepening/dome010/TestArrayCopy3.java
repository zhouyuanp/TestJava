package src.MyPro06.ArrayDeepening.dome010;

public class TestArrayCopy3 {
    public static void main(String[] args) {
        int[] arrA = {11,22,33,44}; //源数组
        int[] arrB = new int[5];//目标数组
        System.out.println("数组拷贝之前");
        //遍历数组
        for (int num:arrB) {
            System.out.print(num+"\t");
        }
        //数组拷贝
        System.arraycopy(arrA,0,arrB,1,2);

        System.out.println("\n数组拷贝之后");
        //遍历数组
        for (int num:arrB) {
            System.out.print(num+"\t");
        }
    }
}

