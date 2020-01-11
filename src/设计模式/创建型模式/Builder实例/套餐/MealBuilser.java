package 设计模式.创建型模式.Builder实例.套餐;

import 设计模式.创建型模式.Builder实例.四种食物.ChickenBurger;
import 设计模式.创建型模式.Builder实例.四种食物.Coke;
import 设计模式.创建型模式.Builder实例.四种食物.Pepsl;
import 设计模式.创建型模式.Builder实例.四种食物.VegBuurger;

//定义各种套餐
public class MealBuilser {
    //套餐一
    public Meal MealOne(){
        System.out.println("套餐一");
        Meal meal = new Meal();
        meal.addItem(new VegBuurger());
        meal.addItem(new Coke());
        return meal;
    }
    //套餐二
    public Meal MealTwo(){
        System.out.println("套餐二");
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsl());
        return meal;
    }
}
