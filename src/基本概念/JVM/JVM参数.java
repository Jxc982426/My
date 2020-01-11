package 基本概念.JVM;



/*
    -XX:+<option>           开启option选项
    -XX:<option>            关闭option选项
    -XX:<option>=<value>    将option选项设为value
*/

public class JVM参数 {
    public JVM参数() {
        System.out.println("    -XX:+<option>           开启option选项\n" +
                "    -XX:<option>            关闭option选项\n" +
                "    -XX:<option>=<value>    将option选项设为value");
    }

    public static void main(String[] args) {
        new JVM参数();
    }
}
