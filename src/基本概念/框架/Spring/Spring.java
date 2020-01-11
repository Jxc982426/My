package 基本概念.框架.Spring;

/*
    Spring 核心技术 （IOC  AOP）
        IOC
            控制反转 将一些；类间的依赖关系交由Spring来管理
            依靠DI（依赖注入）来控制管理
            依靠Bean 来实现

            Bean主要是采用 工厂模式（抽象工厂）

        AOP
            与OOP相对应  面向切片  实现非业务代码的高复用性






*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring {

    public static void main(String[] args) {

        //加载方式
        ApplicationContext context = new ClassPathXmlApplicationContext("");




    }



}
