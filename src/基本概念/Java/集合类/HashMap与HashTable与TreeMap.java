package 基本概念.Java.集合类;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

/*
    HashMap:
        数组结构（Entry<K,V>[] table）+ 链表
        不同步 单线程安全
        允许一个null的key   多个null的value
        同值可能不同序
    HashTable
        同步   多线程安全
        不允许null的key、value
    TreeMap
        最大优势是大小排序的
        对于相同的值TreeMap会整理顺序  HashMap不会

*/
public class HashMap与HashTable与TreeMap {
    public HashMap与HashTable与TreeMap() {
        System.out.println("    HashMap:\n" +
                "        不同步 单线程安全\n" +
                "        允许一个null的key   多个null的value\n" +
                "    HashTable\n" +
                "        同步   多线程安全\n" +
                "        不允许null的key、value\n" +
                "    TreeMap\n" +
                "        最大优势是排序的");
    }

    public static void main(String[] args) {
        new HashMap与HashTable与TreeMap();

        Map<String, Integer> a1 = new HashMap<>();
        Map<String, Integer> a2 = new TreeMap<>();
        Map<String, Integer> a3 = new Hashtable<>();
//        a.put("1", 1);
//        a.put("1", 1);
    }
}
