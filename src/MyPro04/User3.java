package src.MyPro04;

/***
 * 测试静态初始化块的使用
 * 执行顺序-Object类--父类--子类
 * @author zhouyuanpeng
 */
public class User3 {
    int id;  //id
    String name;//账户名
    String pwd; //密码
    static String company; //公司名称

    static {  //静态初始化块
        System.out.println("执行类的初始化工作");
        company = "转转";
        printCompany();
    }
    public static void printCompany(){
        System.out.println(company);

    }
    public static void main(String[] args){
        User3 u3 = null;
        printCompany();
    }
}
