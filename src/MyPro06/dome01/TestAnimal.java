package src.MyPro06.dome01;

public class TestAnimal {

    public static void main(String[] args) {
        //多态 父类引用指向子类对象

        Animal dog = new Dog();
        Animal cat = new Cat();

        //调用子类相同的方法
        dog.shout();
        cat.shout();

        //运行的结果各不相同，子类实现的方法不同，体现了多态大的特症
    }
}
