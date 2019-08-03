package src.MyPro06.dome04;

/**
 * @program: TestJava
 * @description: 脸 访问内部类
 * @author: zhouyuanpeng
 * Created by  2019-08-03 07:06
 */

public class Face {  //脸
    private String shape = "瓜子脸"; //私有属性

    /**
     * 成员内部类
     */

    public class Nose {  // 鼻子
         private String shape = "高鼻梁";
         public void breath(){
         //内部类与外部类有相同的属性时，在访问内部类的属性时，需要加上外部类的 类名.this.属性
             System.out.println("鼻子长在"+Face.this.shape+"形状的脸上");
             System.out.println(shape);
             System.out.println("使用鼻子呼吸！");
         }
    }



}
