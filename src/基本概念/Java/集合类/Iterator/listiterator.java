package 基本概念.Java.集合类.Iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/*
方法	        功能
hasNext()	    判断是否还有下一个元素可以迭代
next()	        返回下一个元素
hasPrevious()	判断是否还有上一个元素可以迭代
previous()	    返回上一个元素
add()	        当前位置添加一个元素
set(E e)	    用指定的元素替换最近返回的元素
remove()	    移除最近返回的元素
*/

public class listiterator {
/*
{0} = 1
{1} = 2
{2} = 3
{2} = 10
{1} = 2
{0} = 0
*/

    public static void main(String[] args) {

//        Iterator
//                ListIterator
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            list.add(i);
        }

        Iterator<Integer> integerIterator = list.listIterator();

        ListIterator<Integer> li = list.listIterator();
        boolean flag = true;
// 如果是正序迭代 或者 有前一个可以迭代的元素
        while (flag || li.hasPrevious()) {
            int index = 0;
            int ele = 0;
            if (flag) {
                index = li.nextIndex();  // nextIndex() 返回下一个元素的索引
                ele = li.next();         // next() 返回下一个元素
            } else {
                index = li.previousIndex(); // previousIndex 返回上一个元素的索引
                ele = li.previous();        // previous() 返回上一个元素
            }
            if (ele == 1) {
                // 如果迭代到的元素是 1 ，则将该元素替换成 0
                li.set(0); // set() 用指定元素替换最后返回的元素
            } else if (ele == 3) {
                li.remove(); // remove() 移除最后返回的元素
            }
            System.out.println("(" + index + ") = " + ele);

            // 判断是否还有下一个可以迭代的元素
            if (!li.hasNext()) {
                flag = false;
                li.add(10); // add() 添加一个元素
            }
        }
    }


    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("1");


        ListIterator<String> it = list.listIterator();

        while (it.hasNext()) {
            int index = it.nextIndex();
            String a = it.next();
            System.out.println(a);

            if (a.equals("1")) {
                list.add("2");
            }

        }
    }

    @Test
    public void test3() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            arrayList.add(String.valueOf(i));
        }
        CopyOnWriteArrayList<String> a = new CopyOnWriteArrayList<>(arrayList);


//        ListIterator<String> it = arrayList.listIterator();
        ListIterator<String> it = a.listIterator();

        while (it.hasNext()) {
            String integer = it.next();
            System.out.println(integer);
            if (integer.equals("0")) {
                it.add("A");
            }
        }


        System.out.println(arrayList);
    }


}


