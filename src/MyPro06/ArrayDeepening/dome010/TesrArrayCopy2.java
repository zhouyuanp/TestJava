package src.MyPro06.ArrayDeepening.dome010;

public class TesrArrayCopy2 {
    public static void main(String[] args) {
        int[] arrA = {11,22,33,44};
        int[] arrB = new int[5];

        //复制
        /**
        arrB [0] = arrA[0];
        arrB [1] = arrA[1];
        arrB [2] = arrA[2];
        arrB [3] = arrB[3];
        arrB [4] = arrA[4];
        */
        int length = Math.min(arrA.length,arrB.length);
        System.out.println("赋值之前");
        for (int i = 0;i< length;i++ ){
            System.out.print(arrB[i]+"\t");
        }

        for (int i = 0;i<length;i++){
            arrB[i] = arrA[i];
        }
        //遍历arrB数组
        System.out.println("\n赋值之后");
        for (int i = 0;i< length;i++ ){
            System.out.print(arrB[i]+"\t");
        }

    }
}
