package 基本概念.Java.集合类;

import java.util.*;


//对于  基本类型  collection会自动装箱
public class collection只存引用 {

    public static void main(String[] args) {

        int a = 10;

        List list = new ArrayList();
        list.add(a);

        Iterator it = list.iterator();
        if (it.hasNext()) {
            //int b = (int) it.next();
            System.out.println(it.next().getClass());
        }

    }


}
