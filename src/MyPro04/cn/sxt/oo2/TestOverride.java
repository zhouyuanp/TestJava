package MyPro04.cn.sxt.oo2;

/**
 * 测试重写
 * @author zhouyuanpeng
 */

public class TestOverride {
    public static void main(String[] args){
        Horse h = new Horse();
        h.run();

    }

}
class Vehicle{
    public void run(){
        System.out.println("跑的更快些");
    }
    public void stop(){
        System.out.println("停止 ！");
    }
    public Person wholsPsg(){
        return new Person();
    }

}

class Horse extends Vehicle{
    public void run(){  //自己的实现覆盖了父类的实现，优先调用自己的实现
        System.out.println("小马，稳稳的快跑");

    }

    public Student wholsPsg(){   //Student 返回值类型小于等于父类的类型
        return new Student();
    }
}

