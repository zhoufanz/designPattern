package com.company.TemplateMethod;

/**
 * Created by hasee on 2017/2/3.
 * 饮料基类
 * 又叫模板方法模式，在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情冴下，重新定义算法中的某些步骤。

 我们使用冲泡咖啡和冲泡茶的例子
 加工流程：
 咖啡冲泡法：1.把水煮沸、2.用沸水冲泡咖啡、3.把咖啡倒进杯子、4.加糖和牛奶
 茶冲泡法：   1.把水煮沸、2.用沸水冲泡茶叶、3.把  茶 倒进杯子、4.加蜂蜜
 */
public abstract class Beverage2 {
    /**
     * 冲泡咖啡或茶的流程
     */
    public final void create(){
        boilWater();
        brew();
        pourIntoCup();
        if (needCondiments()) {
            addCondiments();
        }
    }
    public void boilWater(){
        System.out.println("煮水");
    }
    public abstract void brew();
    public void pourIntoCup(){
        System.out.println("倒进杯子");
    }
    public abstract void addCondiments();

    //钩子
    public  boolean needCondiments(){
        return true;
    }
}

//茶类
class Tea extends Beverage2{

    @Override
    public void brew() {
        System.out.println("用水泡茶");
    }

    @Override
    public void addCondiments() {
        System.out.println("添加蜂蜜");
    }

}

//咖啡类
class Coffee extends Beverage2{

    @Override
    public void brew() {
        System.out.println("用水冲咖啡");
    }

    @Override
    public void addCondiments() {
        System.out.println("添加糖和牛奶");
    }
    public  boolean needCondiments(){
        return false;
    }
}
