package com.lhw.arrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    private ArrayList<Food> foodList = new ArrayList();

    public void addFood(){
        Scanner scanner = new Scanner(System.in);
        Food food = new Food();
        System.out.println("名字：");
        food.setName(scanner.next());
        System.out.println("价格：");
        food.setPrice(scanner.nextDouble());
        System.out.println("描述：");
        food.setDesc(scanner.next());
        foodList.add(food);
    }
    public void showFood(){
        if(foodList.size() == 0){
            System.out.println("没有菜品");
            return;
        }
        for (int i = 0; i < foodList.size(); i++) {
            System.out.println(foodList.get(i).getName());
            System.out.println(foodList.get(i).getPrice());
            System.out.println(foodList.get(i).getDesc());
        }
    }
    public void start(){
        while(true) {
            System.out.println("请输入你的操作：");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.next();
            switch (command) {
                case "1":
                    addFood();
                    break;
                case "2":
                    showFood();
                    break;
                case "3":
                    System.out.println("退出");
                    return;
                default:
                    System.out.println("输入错了");
            }
        }
    }
}
