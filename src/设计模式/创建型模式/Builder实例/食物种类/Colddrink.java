package 设计模式.创建型模式.Builder实例.食物种类;

import 设计模式.创建型模式.Builder实例.接口.Item;
import 设计模式.创建型模式.Builder实例.接口.Packing;
import 设计模式.创建型模式.Builder实例.包装方式.Bottle;

//冷饮的特性  相同的包装bottle    有不同的价格 名字
public abstract class Colddrink implements Item {
    @Override
    public Packing Packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

    @Override
    public abstract String name();
}
