package src.MyPro04;

/***
 * 测试方法的重载
 */
public class User {
    int id;//id
    String name; //账户名
    String pwd;  //密码

    /***
     *构造方法重载
     *
     */

    public User(){

    }
    /**
     * 构造方法重载
     *
     * @param id
     * @param name
     */
    public User(int id,String name){
        super();
        this.id = id;  //this 表示创建好的对象
        this.name = name;
    }
    /**
     * 构造方法重载
     *
     * @param id
     * @param name
     * @param pwd
     */
    public User(int id,String name,String pwd){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        System.out.println("id:"+id+"  name:"+name+"  pwd:"+pwd);
    }

    /***
     * main 方法调用
     *
     */

    public static void main(String[] args){
        User u1 = new User();
        User u2 = new User(101,"周元鹏");
        User u3 = new User(102,"周元鹏01","123456");
    }
}
