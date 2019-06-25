package MyPro04.cn.sxt.oo2;

/***
 * 测试封装
 * @author zhouyuanpeng
 */
public class Person4 {
    private int id;
    private String name;
    private int age;
    private boolean man;   //用is

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){  //高内聚,把操作可以放到这里
        if (age>=1&&age<=130){
            this.age = age;
        }else {
            System.out.println("请输入正常的年龄");
        }

    }
    public int getAge(){
        return this.age;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public boolean isMan() {
        return man;
    }
}
