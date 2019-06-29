package MyPro04.cn.sxt.oo2;

/***
 * 测试多态  继承 重写 父类引用指向子类对象
 *
 * @author  zhouyuanpeng
 */

public class TestPolym {

    public static void main(String[] args) {

        Animal a = new Animal();
        animalCry(a);

        Animal d = new Dog(); //父类引用指向子类对象  类的实例化
        animalCry(d);

        Animal c = new Cat();  //对象自动想上转型
        animalCry(new Cat());

        Dog d2 = (Dog)d;  //强制向下转型
        d2.seeDoor();

//        Dog d3 = (Dog)c;  //不能把猫转换成狗  ClassCastException 类型转化错误
//        d3.seeDoor();
    }


    static void animalCry(Animal a){   //父类引用指向子类对象
        a.shout();
    }

}

//父类

class Animal{
    public void shout(){
        System.out.println("动物叫了一声");
    }
}

//子类继承父类和重写父类方法

class Dog extends Animal{   //方法的继承
    public void shout(){
        System.out.println("狗叫了一声---汪汪汪");
    }

    public void seeDoor(){
        System.out.println("在家看门吧");
    }
}

//子类继承父类和重写父类方法

class Cat extends Animal{
    public void shout(){  //方法的重写
        System.out.println("猫叫了一声---喵喵喵");
    }
}