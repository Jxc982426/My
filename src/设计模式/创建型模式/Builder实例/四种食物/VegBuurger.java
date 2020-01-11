package 设计模式.创建型模式.Builder实例.四种食物;

import 设计模式.创建型模式.Builder实例.食物种类.Burger;

//蔬菜汉堡  名字  价格
public class VegBuurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
