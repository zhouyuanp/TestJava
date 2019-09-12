package src.MyPro06.ArrayDeepening.dome010;

public class TestArrayCopy3 {
    public static void main(String[] args) {
        int[] arrA = {11,22,33,44}; //原数组
        int[] arrB = new int[5];//目标数组
        System.arraycopy(arrA,0,arrB,0,4);
    }
}
