package 基本概念.SQL;

/*
    join 分为内连接  （Inneer） join
             外连接  Outer join
                     left （Outer） join
                     right （Outer） join
                     full （Outer ） join   //注意Mysql不支持full  采用union
    on 表示连接条件


    join  交集  只列出满足条件的
    left join  列出相匹配的  和 在1表中的（未匹配的1表的值 其2表的属性为null）
    right join 同上操作2表
    full join  列出相匹配的  和   未匹配的1.2表中的值（多余属性为null）
*/
public class join {
    public join() {
        System.out.println("    join 分为内连接  （Inneer） join\n" +
                "             外连接  Outer join\n" +
                "                     left （Outer） join\n" +
                "                     right （Outer） join\n" +
                "                     full （Outer ） join   //注意Mysql不支持full  采用union\n" +
                "    on 表示连接条件\n" +
                "\n" +
                "\n" +
                "    join  交集  只列出满足条件的\n" +
                "    left join  列出相匹配的  和 在1表中的（未匹配的1表的值 其2表的属性为null）\n" +
                "    right join 同上操作2表\n" +
                "    full join  列出相匹配的  和   未匹配的1.2表中的值（多余属性为null）");
    }

    public static void main(String[] args) {
        new join();
    }
}
