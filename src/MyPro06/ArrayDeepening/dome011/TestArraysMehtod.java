package src.MyPro06.ArrayDeepening.dome011;

import java.util.Arrays;

public class TestArraysMehtod {

    public static void main(String[] args){
        //创建一个一维数组
        int [] arrA = {1,4,3,5,6,7,6,8};
        int [] arrB = {1,2,3,4,5};
        //(1)快速的遍历元素,把数组元素连接成一个字符串
        System.out.println(Arrays.toString(arrA));
        //(2)
        System.out.println("arrA==arrB:"+(arrA==arrB)); //比较地址 false
        //
        System.out.println(Arrays.equals(arrA,arrB)); //true
        //Object 中的equals Object 用于比较内存地址
        System.out.println(arrA.equals(arrB)); //false

        //(3)
      /*  double[] arrC1 = new double[5];
        double arrC1 = Arrays.copyOf(arrA,5);
        System.out.println(arrC1);*/ //其他类型的数组
        int [] arrC = new int[5]; //默认值为0
        System.out.println("前:"+arrC);
        arrC = Arrays.copyOf(arrA,10); //重新创建了数组
        System.out.println("后:"+arrC);
        System.out.println(Arrays.toString(arrC));
        //(4)fill 填充
        //Arrays.fill(arrC,99);
        //填充代码重写
        for (int i = 0;i<arrC.length;i++){
            arrC[i] =99;
        }
        System.out.println(Arrays.toString(arrC));

        //(5) 对arrA数组进行排序  sort 方法
        Arrays.sort(arrA); //升序排序 从小到大
        System.out.println(Arrays.toString(arrA));

        //对对象进行排序
        //创建一个Person类型的数组,用于存储3个Person类型的对象
        Person [] pers = new Person[3];
        pers[0] = new Person("baishikele",20,"女");
        pers[1] = new Person("kekoukele",20,"男");
        pers[2] = new Person("fenda",18,"女");
        //调用sort方法,对Person类型的数组进行排序
        Arrays.sort(pers);  //类型转换异常,需要指定排序规则
        //遍历数组
        for (Person p:pers){
            System.out.println(p);
        }
    }

}
class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String gender;

    //set和get 方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    // 不带参数
    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }
    //无参数
    public Person() {
    }

    //带参数
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //重写toString 方法
    @Override
    public String toString() {
        return name+"\t"+age+"\t"+gender;
    }

    @Override
    public int compareTo(Person o) { //大于正数,小于负数,等于0

        return this.age-o.age;
    }
}