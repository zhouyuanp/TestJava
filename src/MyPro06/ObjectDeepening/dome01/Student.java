package src.MyPro06.ObjectDeepening.dome01;

import src.MyPro06.ObjectDeepening.dome01.Person;

public  class Student extends Person {

    public Student(){
        super();//调用直接父类的无法构造方法
        System.out.println("Student 类的无参数构造方法");

    }

    @Override
    public void print() {

    }


}
