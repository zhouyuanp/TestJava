package src.MyPro06.dome03;

/**
 *
 * @Description: 测试接口的传递+接口的多继承
 * @Date: 2019/07/31
 * @author zhouyuanpeng
 *
 */


public interface InterfaceA {
    public void show();


}
interface InterfaceB  {

}

interface InterfaceC extends InterfaceB,InterfaceA{  //中间用英文逗哈分割

}

class ImpC implements InterfaceC{

    @Override
    public void show() {

    }
}