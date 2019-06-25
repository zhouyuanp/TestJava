package MyPro04.cn.sxt.oo2;

/**
 * 测试封装
 * @author zhouyuanpeng
 */

public class TestEncapsulation {
    public static void main(String[] args){
        Human h = new Human();
        h.name = "zhouyuanpeng";
        h.height = 180;
        h.sayAge();
        Person4 p4 = new Person4();
        p4.setAge(100);
        System.out.println(p4.getAge());
        p4.setName("zhouyuanpeng");

    }
}

class Boy extends Human{
    void sayHello(){
       // System.out.println(age); //子类无法使用父类的私有属性和方法
    }
}