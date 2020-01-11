package 基本概念.SQL;

/*
    第一范式
        属性的原子性
    第二范式
        记录可唯一区分
    第三范式
        非主属性不依赖其他非主属性
    巴斯-科德范式BCNF
        非主属性不依赖主键子集
*/

public class 范式 {
    public 范式() {
        System.out.println("    第一范式\n" +
                "        属性的原子性\n" +
                "    第二范式\n" +
                "        记录可唯一区分\n" +
                "    第三范式\n" +
                "        非主属性不依赖其他非主属性\n" +
                "    巴斯-科德范式BCNF\n" +
                "        非主属性不依赖主键子集");
    }

    public static void main(String[] args) {
        new 范式();
    }
}
