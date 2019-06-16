package MyPro04.cn.sxt.oo2;

/**
 * 测试继承
 * @author zhouyuanpeng
 */

public class TestExtends {
    public static void main(String[] args){
        Student stu = new Student();
        stu.name = "周元鹏";
        stu.height = 180;
        stu.rest();

        Student stu2 = new Student("周元鹏",27,"软件测试专业");

        System.out.println(stu2 instanceof Student );
        System.out.println(stu2 instanceof Person);
        System.out.println(stu2 instanceof Object);
        System.out.println( new Person() instanceof  Student);
    }

}


class Person /*extends Object*/{
    String name;
    int height;

    public void rest(){

        System.out.println("休息一会 !");
    }
}


class Student extends Person{  //继承

    String major;

    public Student() {

    }

    public void study(){

        System.out.println("学习两小时");
    }

    public Student(String name,int height,String major){
        this.name = name;
        this.height = height;
        this.major = major;

    }
}
