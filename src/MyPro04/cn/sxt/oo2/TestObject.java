package MyPro04.cn.sxt.oo2;

/***
 * 测试toString 重写
 */

public class TestObject {
    public static void main(String[] args){
        TestObject to = new TestObject();
        System.out.println(to.toString());
        Person2 p2 = new Person2("周元鹏",27);
        System.out.println(p2.toString());

    }
    public String toString(){
        return "测试Obiect对象";
    }

}

class Person2{
    String name;
    int age;

    @Override
    public String toString(){
        return name +".年龄："+age;
    }

    public Person2(String name,int age){
        this.name = name;
        this.age = age;

    }
}



