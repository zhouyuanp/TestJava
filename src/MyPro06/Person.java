package src.MyPro06;

public abstract class Person {
    //1 成员变量 实例变量 属性

    private String name; //姓名

    //2 成员方法 实例方法
    public void info(){
        System.out.println("你好，我叫" + name);
    }

    //3静态方法

    public static void show(){

    }
    //4构造方法

    public Person(){
        System.out.println("Person 类的无参数构造方法");
    }

    //5final 修饰的方法，只能被子类调用，不能被子类重写

    public final void fun(){

    }
    //6抽象方法

    public abstract void print();
}
