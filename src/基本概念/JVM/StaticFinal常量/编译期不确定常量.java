package 基本概念.JVM.StaticFinal常量;

import java.util.UUID;

public class 编译期不确定常量 {
    public static void main(String[] args) {
        System.out.println(ANotDefind.a);
    }
}


class ANotDefind {
    public static final String a = UUID.randomUUID().toString();

    static{
        System.out.println("static block");
    }
}