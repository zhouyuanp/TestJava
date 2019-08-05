package MyPro04.cn.sxt.oo2;

/**
 * 测试封装
 * @author zhouyuanpeng
 */

public class TestEncapsulation {
    public static void main(String[] args){
        MyPro04.cn.sxt.oo2.Human h = new MyPro04.cn.sxt.oo2.Human();
        h.name = "zhouyuanpeng";
        h.height = 180;
        h.sayAge();
        MyPro04.cn.sxt.oo2.Person4 p4 = new MyPro04.cn.sxt.oo2.Person4();
        p4.setAge(100);
        p4.setId(123);
        System.out.println(p4.getId());
        System.out.println(p4.getAge());
        p4.setName("zhouyuanpeng");

    }
}

class Boy extends MyPro04.cn.sxt.oo2.Human {
    void sayHello(){
       // System.out.println(age); //子类无法使用父类的私有属性和方法
    }
}