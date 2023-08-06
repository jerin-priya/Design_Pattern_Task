package com.mycompany.builderdesignpattern;

public class Client {
    public static void main(String[] args)
    {
        Burger burger = new Burger.BurgerBuilder()
                .cheese(3).letus(0).cheese(2).meat(2).cheese(2).letus(1).cheese(1).build();
        
        
        System.out.println("Meat : " + burger.numOfMeat());
        System.out.println("Cheese : " + burger.numOfCheese());
        System.out.println("Letus : " + burger.numOfLetus());
        System.out.println("Cost : " + burger.getCost());
    }
}
