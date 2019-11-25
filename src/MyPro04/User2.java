package src.MyPro04;

/***
 *  测试static 关键字的用法
 * @author zhouyuanpeng
 */

public class User2 {
    int id; //id
    String name; //账户名
    String pwd;//密码

    static String company = "zhuanzhuan";//公司名称

    public User2(int id,String name){
        this.id = id;
        this.name = name;

    }
    public void login(){
        System.out.println(company);  //非静态方法可以使用静态的变量+静态的方法
        printCompany();
        System.out.println("登录:"+name);
    }
    public static void printCompany(){
        //login();不能调用非静态的方法
        System.out.println(company);
    }
    public static void main (String[] args){
        User2 u = new User2(101,"Hi 周元鹏");
        User2.printCompany();  //只能调用static 方法和变量 静态方法中不能使用非静态的方法
        User2.company = "北京转转";
        User2.printCompany();
        u.login();

    }

}
