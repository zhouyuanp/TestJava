package src.MyPro06.dome;

public abstract  class Animal {  //动物的抽象类

    public abstract void shout(); //抽象方法

}

class Dog extends Animal{  //重写父类的方法

    @Override
    public void shout() {
        System.out.println("小狗，汪汪汪");


    }
}
class Cat extends Animal{   //重写父类的方法


    @Override
    public void shout() {
        System.out.println("小猫，喵喵喵");

    }
}
