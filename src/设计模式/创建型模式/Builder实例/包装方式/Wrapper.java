package 设计模式.创建型模式.Builder实例.包装方式;


import 设计模式.创建型模式.Builder实例.接口.Packing;

//包装方式  wrapper
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper!";
    }
}
