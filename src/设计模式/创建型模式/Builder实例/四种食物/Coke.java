package 设计模式.创建型模式.Builder实例.四种食物;

import 设计模式.创建型模式.Builder实例.食物种类.Colddrink;

//可乐   名字  价格
public class Coke extends Colddrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
