package src.MyPro04.cn.sxt.oo;

import MyPro04.cn.sxt.oo2.Human;

public class TestEncapsulation2 {
    public static void main(String[] arge){
        Human h = new Human();
//        h.age = 13;
//        h.name = "zhouyuanpeng";  //name 为default 属性,不能被不同包的类访问
        h.sayAge(); //public 修饰不同的包和类都能用
    }
}

class Girl extends Human {  //Girl 位于不同的包中,且是Human的子类
    void sayGood(){
        System.out.println(height);
    }
}
