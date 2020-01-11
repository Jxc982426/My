package 源码;

import java.util.HashMap;
import java.util.Map;

public class hashmap {


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("jxc1",1);
        map.put("jxc2",1);
        map.put("jxc3",1);
        map.put("jxc4",1);
        map.put("jxc5",1);
        map.put("jxc6",1);
        map.put("jxc7",1);
        map.put("jxc8",1);

        map.entrySet();

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            entry.getKey();
            entry.getValue();

            System.out.println(entry.getKey() + entry.getValue());
            System.out.println(entry);

        }

    }
}
