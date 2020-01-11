package 基本概念.Java.集合类;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
    ArrayList
        基于动态数组   Object 数组
        自增0.5倍（右移一位）
        适合查找
        支持快速随机访问（实现了RandomAccess 接口）
        空间占用较少
    LinkedList
        基于链表   双向循环链表
        便利的大量增删
        空间占用较多
    Vector
        基于数组
        最大优势线程同步
        自增1倍
*/
public class ArrayList与LinkedList与Vector {
    List arrList = new ArrayList<>();
    List arrList2 = new LinkedList<>();
    List arrList3 = new Vector();
}
