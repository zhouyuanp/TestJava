package MyPro04.cn.sxt.oo2;

/**
 * 测试equals
 *
 */

public class TestEquals {
    public static void main(String[] args){
        Object obj;
        String str;

        User u1 = new User(100,"周元鹏","123456");
        User u2 = new User(100,"周元鹏","123456");
        System.out.println(u1==u2);//不是一个同对象
        System.out.println(u1.equals(u2));//根据ID来判断

        String str1 = new String("zhuan");
        String str2 = new String("zhuan");
        System.out.println(str1==str2); //false  //不是同一个对象
        System.out.println(str1.equals(str2)); //ture//根据字符串的内容来判断

    }
}

class User{
    int id;
    String name;
    String pwd;
    public User(int id, String name, String pwd){
        super();
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass()!= obj.getClass())
            return false;
        User other = (User)obj;
        if (id != other.id)
            return false;
        return true;
    }
}