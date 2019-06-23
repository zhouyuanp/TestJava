package MyPro04.cn.sxt.oo2;

public class TestSuper02 {
    public static void main(String[] args) {
        System.out.println("开始构建一个ChildClass对象.....");
        new ChildClass2();
    }
}
class FatherClass2 {
     public FatherClass2() {
         System.out.println("创建FatherClass,构造方法");
        }
    }
class ChildClass2 extends FatherClass2 {
     public ChildClass2() {
        //super();  //super();  //默认调用父类的构造器 向上追溯父类和Object 类
        System.out.println("创建ChildClass");
        }
    }
