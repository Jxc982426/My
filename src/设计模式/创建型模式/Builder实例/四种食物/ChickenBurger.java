package 设计模式.创建型模式.Builder实例.四种食物;

import 设计模式.创建型模式.Builder实例.食物种类.Burger;

//鸡肉汉堡  名字 价格
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return  50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
