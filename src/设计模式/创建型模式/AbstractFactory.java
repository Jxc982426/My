package 设计模式.创建型模式;


public class AbstractFactory {


    public static void main(String[] args) {

        // 创建A1工厂
        FactoryInterface fi = new FactoryA1();
        // A1工厂 得到A1
        A a = fi.getA();
        // 使用A1的Func
        a.Func();

        FactoryInterface fi2 = new FactoryA2();
        a = fi2.getA();
        a.Func();

    }

}


interface A {
    void Func();
}

class A1 implements A {
    public A1() {
        System.out.println("A1被构造");
    }

    @Override
    public void Func() {
        System.out.println("A1实现A中的Func方法");
    }
}

class A2 implements A {
    public A2() {
        System.out.println("A2被构造");
    }

    @Override
    public void Func() {
        System.out.println("A2实现A中的Func方法");
    }
}

interface FactoryInterface {
    //定义工厂接口 及 返回A类型的函数b
    A getA();
}

//A1工厂   实现FactoryInterface接口  实现其getA方法  new一个 A类型的A1
class FactoryA1 implements FactoryInterface {

    @Override
    public A getA() {
        return new A1();
    }
}

//A2工厂   实现FactoryInterface接口  实现其getA方法  new一个 A类型的A2
class FactoryA2 implements FactoryInterface {
    @Override
    public A getA() {
        return new A2();
    }
}