package 设计模式.创建型模式.Builder实例.食物种类;

//import 设计模式.创建型模式.Builder实例.包装方式.Wrapper;
import 设计模式.创建型模式.Builder实例.接口.Item;
import 设计模式.创建型模式.Builder实例.接口.Packing;
import 设计模式.创建型模式.Builder实例.包装方式.*;

//汉堡的特性  相同的包装wrapper    有不同的价格 名字
public abstract class Burger implements Item {
    @Override
    public Packing Packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

    @Override
    public abstract String name();
}
