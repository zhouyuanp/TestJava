import java.util.*;

public class test {
    public static void main (String[] args){

        //包装类的使用

        int a1 = 1;
        Integer a2 = new Integer(2);

        List<Integer> list = new ArrayList<Integer>();   //自动分装成Integer  封包和解包
        list.add(a1);
        list.add(a2);
        list.add(9999);
        System.out.println("list:"+list);
        list.remove(0);
        System.out.println("list:"+list);
        list.set(0,3);
        System.out.println("list:"+list);

        int b = list.get(0);
        System.out.println("b:"+b);
        //String
        StringBuilder sb = new StringBuilder();
        sb.append("123");
        sb.append("456");

        String s = sb.toString();

        System.out.println("s:"+s);
        //测试map
        Map<String,String> map = new HashMap<String,String>();
        map.put("k1","1357");
        map.put("k2","2458");
        System.out.println(map.get("k1"));
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:" + key + " value:" + value);
        }



        //jdk 1.8 新特性
        map.forEach((k,v) ->{
            System.out.println("key:" + k + "  value:" + v);
                }
        );







    }
}
