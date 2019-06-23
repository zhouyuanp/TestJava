package MyPro04.cn.sxt.oo2;

public class Human{   //default 不是一个包中的也不能用
        private int age;   //私有属性,只能在自己类中使用
        String name;  //什么都不加默认是def  同一个包可以用
        protected int height;
        public void sayAge(){
            int age = 100;
            System.out.println(age);
        }

}
