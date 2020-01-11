package 基本概念.Java.类;

/*
    类   ：将一组现实意义抽象成代码java中以class展示
    实例 ：class的具体展现
    对象 ：广义来说 对象包含类、实例及其现实意义
          狭义来说 对象也是class的实例











    静态变量：
        static 修饰  属于类

    实例变量：
        必须依存某一个实例  属于类的实例





 */
public class 类对象实例 {
    public 类对象实例() {
        System.out.println("    类   ：将一组现实意义抽象成代码java中以class展示\n" +
                "    实例 ：class的具体展现\n" +
                "    对象 ：广义来说 对象包含类、实例及其现实意义\n" +
                "          狭义来说 对象也是class的实例");


        String a;
    }

    public static void main(String[] args) {
        new 类对象实例();
    }
}
