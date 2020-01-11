package 设计模式.创建型模式;

import java.util.ArrayList;
import java.util.List;

//类比于工厂模式   建造者模式返回实例的集合
public class Builder {

    private List<A> list = new ArrayList<>();

    //使用了  A  A1  A2  储存在AbstractFactory
    public void getA1(int count){
        for (int i = 0; i < count; i++) {
            list.add(new A1());
        }
    }
    public void getA2(int count){
        for (int i = 0; i < count; i++) {
            list.add(new A2());
        }
    }


    //类内测试
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.getA1(5);
        builder.getA2(4);
    }
}
