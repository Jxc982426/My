package 基本概念.Java.集合类.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class 便利时操作有趣的问题 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        forsize(list);
        System.out.println();
        System.out.println(list.toString());

        whilehasnext(list);
        System.out.println();
        System.out.println(list.toString());

        forhasnext(list);
        System.out.println();
        System.out.println(list.toString());

    }

    public static void forsize(List list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

            if ((int)list.get(i) == 1) {
                System.out.print("list == 1  ");
                list.add(100);
            }
        }
    }

    public static void whilehasnext(List list) {
        ListIterator iterator = list.listIterator();
        try {
            while (iterator.hasNext()) {
                int a = (int) iterator.next();
                System.out.print(a + " ");

                if (a == 1) {
                    System.out.print("list == 1  ");
                    iterator.add(100);
//                    list.add(100);
                }
            }
        } catch (Exception e) {
            System.out.println("ListIterator  while hasNext() 遍历时出现异常");
            e.printStackTrace();
        }
    }

    public static void forhasnext(List list) {
        ListIterator iterator = list.listIterator();
        try {
            for (int i = 0; iterator.hasNext(); i++) {
                int a = (int) iterator.next();
                System.out.print(a + " ");

                if (a == 1) {
                    System.out.print("list == 1  ");
                    list.add(100);
                }
            }
        } catch (Exception e) {
            System.out.println("ListIterator  for hasNext() 遍历时出现异常");
            e.printStackTrace();
        }
    }

    public static void foreach(List list) {
//        foreach();
    }

}
