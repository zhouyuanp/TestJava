package src.MyPro06.dome02;

public interface MyInterface {

    public static final String name2 = "张三";
    String name = "张三";
    void show();
    String fun();
    int [] method();
   /**
    public void MyInterface(){

    }*/
   /**
    * jdk 1.8 的新特性
    * 非抽象方法必须使用default 来修饰
    *
    */
   public default void method2(){

   }
}
