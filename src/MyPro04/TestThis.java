package src.MyPro04;

/***
 * 测试this
 */
public class TestThis {

    int a,b,c;

    TestThis(int a,int b){
        this.a = a;  //this 用于区分成员变量和局部变量--就近原则  this.a 等于成员变量
        this.b = b;
    }
    TestThis(int a,int b,int c){
        this(a, b); //通过this 来调用构造器  this(a,b);位于构造方法的第一句,  在一个构造方法中调用另外一个构造方法
        this.c = c;
    }
    void sing(){

    }
    void eat(){
        this.sing();//调用本类中的sing();
        System.out.println("努力的去改变,努力才能站起来--任正非");
    }
    public static void main(String[] args){
        TestThis hi = new TestThis(2,4);
        hi.eat();
    }
}
