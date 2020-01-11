package 设计模式.创建型模式.Builder实例.套餐;

import 设计模式.创建型模式.Builder实例.接口.Item;

import java.util.ArrayList;
import java.util.List;

//定义套餐的格式 ItemList  其中可添加Item 获取总价格 套餐内容
public class Meal {
    private List<Item> items = new ArrayList<>();

    //添加Item
    public void addItem(Item item){
        items.add(item);
    }
    //总价格
    public float getCost(){
        float cost = 0f;
        for (Item item : items){
            cost += item.price();
        }
        return cost;
    }
    //show内容
    public void showItems(){
        for (Item item : items){
            System.out.println(item.name()+ "   " + item.Packing().pack() + item.price());
        }
    }
}
